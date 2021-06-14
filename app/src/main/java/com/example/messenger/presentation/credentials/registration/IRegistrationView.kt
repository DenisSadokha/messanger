package com.example.messenger.presentation.credentials.registration

import com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.example.messenger.base.IBaseView


@StateStrategyType(OneExecutionStateStrategy::class)
interface IRegistrationView : IBaseView {
    fun showLoad()
    fun stopLoad()
}