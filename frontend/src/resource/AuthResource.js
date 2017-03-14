import AbstractResource from './AbstractResource';

class AuthResource extends AbstractResource {

    constructor() {
        super('auth');
    }

    authentication(email, senha) {
        return axios.post(this.path, {parans : {email : email, senha : senha }});
    }

    cadastrar(usuario) {
        return axios.post(this.path + '/cadastrar', usuario);
    }

}

export default new AuthResource;