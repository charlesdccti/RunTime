import axios from 'axios';
window.$ = window.jQuery = require('jquery');

window.axios = axios

axios.defaults.baseURL = 'api';
axios.defaults.timeout = 2000;
//axios.defaults.headers.common['Authorization'] = 'Bearear ' + window.localStorage.getItem('token');