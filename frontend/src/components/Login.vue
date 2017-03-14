<script>
    import AuthResource from './../resource/AuthResource';

    export default {
        data() {
            return {
                email: '',
                senha: ''
            }
        },

        methods : {
            entrar() {

                AuthResource.authentication(this.email, this.senha)
                    .then((response) => {

                    })
                    .catch((error) => {

                    });
            }
        }
    }
</script>

<template>
    <div>
    
        <div class="login">
            <div class="login-header">
                <img src="./../assets/img/logotipo_md.png" class="img-responsive center-block" />
            </div>

            <div class="login-box">
                <input type="text" class="form-control" v-model="email" placeholder="Email" required autofocus />
                <br/>
                <input type="password" class="form-control" v-model="senha" placeholder="Senha" required />

                <div class="text-right">
                    <router-link to="recuperacao">Esqueceu sua senha?</router-link>
                </div>

                <br/>
                <button @click="entrar" class="btn btn-primary" type="submit">Entrar</button>

                <hr/>
                Não tem uma conta? Cria sua conta, é gratis!
                <br/><br/>
                <router-link to="registro" class="btn btn-default">Crie sua Conta!</router-link>
            </div>
        </div>
    
    </div>
</template>

<style lang="scss">
    .login {
        padding: 15px;
        max-width: 350px;
        border-radius: 20px;
        margin: 0 auto;
        margin-top: 50px;
        margin-bottom: 50px;
    }
    .login-header {
        text-align: center;
        margin-bottom: 25px;
        img {
            width: 85%;
        }
    }
    .login-box {
        text-align: center;
    }
</style>