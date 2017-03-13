import AbstractResource from './AbstractResource';

class AuthResource extends AbstractResource {

    constructor() {
        super('auth');
    }

    authentication(email, senha) {
        return axios.post(this.path, {parans : {email : email, senha : senha }});
    }

}

export default new AuthResource;