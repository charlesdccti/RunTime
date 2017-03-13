<script>
    export default {

    }
</script>

<template>
    <div>
    
        <div class="login">
            <div class="login-header">
                <img src="./../assets/img/logotipo_md.png" class="img-responsive center-block" />
                
                <h4>Informe seu email para recuprar sua conta</h4>
            </div>

            <div class="login-box">
                <form>
                    <input type="text" class="form-control" placeholder="Email" required autofocus />
                    
                    <hr/>

                    <button class="btn btn-block btn-primary" type="submit">Recuperar de Senha</button>
                </form>
                <br/><br/>
                <router-link to="login">Voltar</router-link>
            </div>
        </div>
    
    </div>
</template>

<style lang="scss" scoped>

</style>