import { Routes } from '@angular/router';
import path from 'node:path';
import { Login } from './components/login/login';
import { Component } from '@angular/core';

export const routes: Routes = [
    {
        path: 'login', component:Login,
    },
    {
        path: '', redirectTo:"login", pathMatch: 'full'
    },
    {
        path: '**', component:Login
    }
];
