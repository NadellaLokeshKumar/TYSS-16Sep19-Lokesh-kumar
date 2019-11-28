import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { LokeshComponent } from './lokesh/lokesh.component';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router';
import { CountriesComponent } from './countries/countries.component';
import { IndiaComponent } from './india/india.component';
import { CategoriesComponent } from './categories/categories.component';
import { SourcesComponent } from './sources/sources.component';
import { SearchnewsComponent } from './searchnews/searchnews.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LokeshComponent,
    CountriesComponent,
    IndiaComponent,
    CategoriesComponent,
    SourcesComponent,
    SearchnewsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path : `lokesh`, component : LokeshComponent},
      {path : `countries`, component : CountriesComponent},
      {path : `categories`, component : CategoriesComponent},
      {path : `sources`, component: SourcesComponent},
      {path : `searchnews`, component : SearchnewsComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
