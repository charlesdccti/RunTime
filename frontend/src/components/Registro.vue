<script>
    import AuthResource from './../resource/AuthResource';

    export default {
        data() {
            return {
                email : '',
                senha : '',
                repita_senha : '',
            }
        },
        methods: {
            cadastrar() {
                const usuario = {
                    email : this.email,
                    senha : this.senha
                }

                AuthResource.cadastrar(usuario)
                    .then((response) => {
                        console.log(response);
                    })
                    .catch((error) => {
                        console.log(error);
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

                <h3>Cadastre-se é rapidinho!</h3>
            </div>

            <div class="login-box">
                <form v-on:submit.prevent="cadastrar">
                    <input type="text" class="form-control" v-model="email" placeholder="Email" required autofocus />
                    <br/>

                    <input type="password" class="form-control" v-model="senha" placeholder="Senha" required />
                    <br/>

                    <input type="password" class="form-control" v-model="repita_senha" placeholder="Repita a Senha" required />

                    <br/>
                    <button class="btn btn-success" type="submit">Cadastrar</button>
                    <hr/>

                    Você já tem uma conta? Faço seu login.
                    <br/><br/>
                    <router-link to="login" class="btn btn-default">Entrar</router-link>
                </form>
            </div>
        </div>
    
    </div>
</template>

<style lang="scss" scoped>

</style>