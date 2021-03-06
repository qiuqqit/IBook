package com.moduleBookMall.di.component


import com.common.di.ConfigPersistent
import com.common.di.component.AppComponent
import com.common.di.module.ActivityModule
import com.common.di.module.FragmentModule
import com.moduleBookMall.di.module.BookMallModule
import dagger.Component

/**
 * A dagger component that will live during the lifecycle of an Activity but it won't
 * be destroy during configuration changes. Check [BaseActivity] to see how this components
 * survives configuration changes.
 * Use the [ConfigPersistent] scope to annotate dependencies that need to survive
 * configuration changes (for example Presenters).
 */
@ConfigPersistent
@Component(dependencies = [(AppComponent::class)])
interface BookMallConfigPersistentComponent {

    fun activityComponent(activityModule: ActivityModule,bookMallModule: BookMallModule): BookMallActivityComponent
    fun fragmentComponent(fragmentModule: FragmentModule): BookMallFragmentComponent

}