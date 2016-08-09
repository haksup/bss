import { Component, OnInit } from '@angular/core';
import { Hero } from './hero';
import { HeroDetailComponent } from './hero-detail.component';
import { HeroService } from './hero.service';


@Component({
    selector: 'my-app',
    templateUrl : 'app/app.component.html',
    styleUrls : ['app/app.component.css'],
    directives :[HeroDetailComponent],
    providers : [HeroService]
})

export class AppComponent implements OnInit {
	constructor(private heroService : HeroService) {}
	ngOnInit(){
		this.getHeroes();
	}
	
    title = 'Tour of Heroes';
    heroes: Hero[];
    selectedHero : Hero;
    
    onSelect(hero: Hero) { this.selectedHero = hero; }
    
    getHeroes(){
    	// this.hero =this.heroService.getHeroes();
    	this.heroService.getHeroes().then(heroes => this.heroes = heroes); 
    }
}


/*
Copyright 2016 Google Inc. All Rights Reserved.
Use of this source code is governed by an MIT-style license that
can be found in the LICENSE file at http://angular.io/license
*/