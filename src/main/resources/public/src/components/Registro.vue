<script>
    export default {

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
                <form>
                    <input type="text" class="form-control" placeholder="Email" required autofocus />
                    <br/>
                    <input type="password" class="form-control" placeholder="Senha" required />

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