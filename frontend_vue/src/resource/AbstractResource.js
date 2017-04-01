export default class AbstractResource {

    constructor(path) {
        this.path = path;
    }

    getById(id) {

    }

    save(object) {
        return axios.post(this.path, object);
    }

}