require('./assets/scss/style.scss');
require('./assets/img/ico.png');

require('./bootstrap');

import Vue from 'vue';
import VueRouter from 'vue-router';

import App from './App.vue';
import Login from './components/Login.vue';
import Registro from './components/Registro.vue';
import Senha from './components/Senha.vue';

Vue.use(VueRouter);

const router = new VueRouter({
  routes : [
    {
      path: '/login',
      name: 'login',
      component: Login
    },
    {
      path: '/registro',
      name: 'registro',
      component: Registro
    },
    {
      path: '/recuperacao',
      name: 'recuperacao',
      component: Senha
    },
    {
      path: '/',
      component: App
    }
  ]
});

router.beforeEach((to, from, next) => {
    console.log(to);
    console.log(from);
    next();
});

new Vue({
  router,
  mounted() {
    console.log($);
  },
}).$mount('#app');
