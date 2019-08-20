package designpatterns.commandpattern.menu

enum class MenuActions(val position: Int, val menuAction: MenuAction) {
    MY_INVESTMENTS(3, MenuAction("My investments", "X", MyInvestmentsAction())),
    MY_ACCOUNT(1, MenuAction("My Account", "Y", AccountAction())),
    PROFITABILITY(2, MenuAction("Profitability", "Z", ProfitabilityAction())),
    COPY_LINK(4, MenuAction("Copy link", "A") { println("Copying link...") });

    companion object {
        fun getActions(): List<MenuAction> {
            return MenuActions
                .values()
                .sortedBy { it.position }
                .map { it.menuAction }
        }
    }
}