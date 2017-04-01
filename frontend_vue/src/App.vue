<script>
    import UsuarioResource from './resource/UsuarioResource';

    export default {
        data() {
            return {
                img : 'test.jpg'
            }
        },
        methods : {
            get() {
                console.log(UsuarioResource);

                const object = {email: 'lincoln@sadf.com', senha: 'asd153fsa3'};

                UsuarioResource.save(object)
                .then((response) => {
                    console.log(response.data);
                }).catch((error) => {
                    console.log(error);
                });
            }
        }
    }
</script>

<template>
    <div>
        <img src="./assets/img/logotipo_xs.png" />>
        <h2 style="text-align: center">Teste de reload</h2>
        <button @click="get" class="btn btn-default"><span class="glyphicon glyphicon-heart"></span> testar</button>
        <i class="fa fa-home"></i>
        
        <router-view></router-view>
    </div>
</template>

<style lang="scss">
    //@import './assets/scss/style';
</style>