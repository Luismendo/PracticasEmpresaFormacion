import { ErrorHandler, NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { LateralMenuComponent } from './lateral-menu/lateral-menu.component';
import { TablePersonaComponent } from './table-persona/table-persona.component';
import { DetailPersonaComponent } from './detail-persona/detail-persona.component';
import { FormPersonaComponent } from './form-persona/form-persona.component';

import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {MatNativeDateModule} from '@angular/material/core';
import {HttpClientModule, HTTP_INTERCEPTORS} from '@angular/common/http';

import {MaterialExampleModule} from './material/material.module';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatTooltipModule} from '@angular/material/tooltip';
import { IntroComponent } from './intro/intro.component';
import { SidenavComponent } from './sidenav/sidenav.component';
import { ModalComponent } from './modal/modal.component';
import { InMemoryWebApiModule } from 'angular-in-memory-web-api';
import { PersonasService } from './personas/personas.service';
import { ErrorComponent } from './error/error.component';
import { GlobalErrorHandlerService } from './interceptors/global-error-handler.service';
import { CustomHttpInterceptorService } from './interceptors/error-interceptor.service';

@NgModule({
  declarations: [
    AppComponent,
    LateralMenuComponent,
    TablePersonaComponent,
    DetailPersonaComponent,
    FormPersonaComponent,
    IntroComponent,
    SidenavComponent,
    ModalComponent,
    ErrorComponent,
  ],entryComponents:[
    ModalComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    FormsModule,
    ReactiveFormsModule,
    MatNativeDateModule,
    HttpClientModule,
    MaterialExampleModule,
  ],
  providers: [
    {provide: ErrorHandler, useClass: GlobalErrorHandlerService},
    {provide: HTTP_INTERCEPTORS, useClass: CustomHttpInterceptorService, multi:true}
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
