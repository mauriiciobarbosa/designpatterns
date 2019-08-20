package designpatterns.commandpattern.menu

import designpatterns.commandpattern.router.Router
import designpatterns.commandpattern.router.RouterProvider

typealias Action = () -> Unit

abstract class NavigationAction(protected val router: Router = RouterProvider.router) : Action

class ProfitabilityAction : NavigationAction() {
    override fun invoke() {
        router.goToProfitability()
    }
}

class AccountAction : NavigationAction() {
    override fun invoke() {
        router.goToMyAccount()
    }
}

class MyInvestmentsAction : NavigationAction() {
    override fun invoke() {
        router.goToMyInvestments()
    }
}