import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {RouterModule} from '@angular/router';
import {FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';


import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { HelpComponent } from './help/help.component';
import { AboutComponent } from './about/about.component';
import { LoginComponent } from './login/login.component';
import { FooterComponent } from './footer/footer.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { PropertyBindingComponent } from './data-binding/property-binding/property-binding.component';
import { EventbindingComponent } from './data-binding/eventbinding/eventbinding.component';
import { TwoWayDatabindingComponent } from './data-binding/two-way-databinding/two-way-databinding.component';
import { DirectivesComponent } from './directives/directives.component';
import { StructuralDirectivesComponent } from './directives/structural-directives/structural-directives.component';
import { NgIfComponent } from './directives/structural-directives/ng-if/ng-if.component';
import { NgForComponent } from './directives/structural-directives/ng-for/ng-for.component';
import { NgSwitchComponent } from './directives/structural-directives/ng-switch/ng-switch.component';
import { combineLatest } from 'rxjs';
import { CustomDirective } from './custom.directive';
import { RegisterComponent } from './register/register.component';
import { Form1Component } from './form1/form1.component';
import { Form2Component } from './form2/form2.component';
import { Form3Component } from './form3/form3.component';
import { Form4Component } from './form4/form4.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';
import { DollarPipe } from './dollar.pipe';
import { RajaReactiveFormComponent } from './raja-reactive-form/raja-reactive-form.component';



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HelpComponent,
    AboutComponent,
    LoginComponent,
    HomeComponent,
    FooterComponent,
    DataBindingComponent,
    PropertyBindingComponent,
    EventbindingComponent,
    TwoWayDatabindingComponent,
    DirectivesComponent,
    StructuralDirectivesComponent,
    NgIfComponent,
    NgForComponent,
    NgSwitchComponent,
    CustomDirective,
    RegisterComponent,
    Form1Component,
    Form2Component,
    Form3Component,
    Form4Component,
    ReactiveFormComponent,
    ParentComponent,
    ChildComponent,
    CommentComponent,
    CommentDetailsComponent,
    DollarPipe,
    RajaReactiveFormComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path : ``, component : HomeComponent},
      {path : `about`, component : AboutComponent},
      {path : `help`, component : HelpComponent},
      {path : `login`, component : LoginComponent},
      {path : `register`, component : RegisterComponent},
      {path : `propertybinding`, component : PropertyBindingComponent},
      {path : `eventbinding`, component : EventbindingComponent},
      {path : `two-way`, component : TwoWayDatabindingComponent},
      {path : `ngif`, component : NgIfComponent},
      {path : `ngfor`, component : NgForComponent},
      {path : `ngswitch`, component : NgSwitchComponent},
      {path : `register`, component : RegisterComponent},
      {path : `form1`, component : Form1Component},
      {path : `form2`, component : Form2Component},
      {path : `form3`, component : Form3Component},
      {path : `form4`, component : Form4Component},
      {path : `reactive-form`, component : ReactiveFormComponent},
      {path : `parent`, component : ParentComponent},
      {path : `comment-details`, component : CommentDetailsComponent},
      {path : `raj`, component : RajaReactiveFormComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
