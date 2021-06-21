package com.oliwiakepczynska.quizzapp.di

import org.koin.core.module.Module

var koinInjector: List<Module> = listOf(
    networkModule
)