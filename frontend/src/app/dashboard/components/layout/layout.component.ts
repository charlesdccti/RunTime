import { AuthService } from './../../../auth/services/auth.service';
import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';

@Component({
    selector: 'app-layout',
    templateUrl: './layout.component.html',
    styleUrls: ['./layout.component.scss']
})
export class LayoutComponent implements OnInit {

    constructor(private router: Router, private authService: AuthService) { }

    ngOnInit() {
        //this.router.navigateByUrl('/app');
    }

}
