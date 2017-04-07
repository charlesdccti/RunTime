import { Http } from '@angular/http';
import 'rxjs/add/operator/toPromise';

export abstract class AbstractService {

    private baseUrl : string = 'http://localhost:8090/api/';
    public url : string;
    
    abstract getHttp() : Http;

    /*getList() : Promise<T> {
        return this.getHttp().get(this.baseUrl + this.url)
            .toPromise().then((response : Response) => response.json());
    }*/

}
