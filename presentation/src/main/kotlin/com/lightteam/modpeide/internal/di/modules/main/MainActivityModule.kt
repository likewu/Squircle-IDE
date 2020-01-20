/*
 * Licensed to the Light Team Software (Light Team) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The Light Team licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lightteam.modpeide.internal.di.modules.main

import androidx.lifecycle.ViewModelProvider
import com.lightteam.modpeide.internal.di.scopes.PerActivity
import com.lightteam.modpeide.ui.main.activities.MainActivity
import com.lightteam.modpeide.ui.main.activities.utils.ToolbarManager
import com.lightteam.modpeide.ui.main.viewmodel.MainViewModel
import com.lightteam.modpeide.ui.common.viewmodel.ViewModelFactory
import com.lightteam.modpeide.ui.main.viewmodel.ExplorerViewModel
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {

    @Provides
    @PerActivity
    fun provideMainViewModel(activity: MainActivity, factory: ViewModelFactory): MainViewModel {
        return ViewModelProvider(activity, factory).get(MainViewModel::class.java)
    }

    @Provides
    @PerActivity
    fun provideExplorerViewModel(activity: MainActivity, factory: ViewModelFactory): ExplorerViewModel {
        return ViewModelProvider(activity, factory).get(ExplorerViewModel::class.java)
    }

    @Provides
    @PerActivity
    fun provideToolbarManager(activity: MainActivity): ToolbarManager {
        return ToolbarManager(activity)
    }
}