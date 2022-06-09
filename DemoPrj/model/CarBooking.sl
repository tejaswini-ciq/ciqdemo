com.conformiq.creator.structure.v15
creator.gui.screen qml439167b19065411f8264e57175b52bde "Car Buy Sell"
{
	creator.gui.form qml9ce23bc9530d4c35b834f8c76b414ccf "CarTradeSelection"
		deleted
	{
		creator.gui.radiobutton qmlbc26e2e7dd2a4e5fa9108cf2ea36d188 "Buy"
			status = dontcare
			deleted;
		creator.gui.radiobutton qmla424445a96cb41809ef560ecec41b210 "TradeType"
			type = qml6ff11cb726844c1b868b67a41182c59e
			status = dontcare
			deleted;
		creator.gui.radiobutton qml3bf7531322214823b8fe5712903050e1 "unnamed"
			status = dontcare
			deleted;
		creator.gui.button qmlb5e9f15f2a3d42c3a8c162e679d17a44 "Submit"
			status = dontcare
			deleted;
	}
	creator.gui.form qml08f477e1e89848d892a31a19e9c8d7c5 "OrderDetails"
	{
		creator.gui.textbox qml2e3bacd266604d559356e8549dc191cc "AddressLine1"
			type = String
			status = dontcare
			deleted;
		creator.gui.textbox qml3c64c7fd7db849208a8bb053e55a6e70 "AddressLine2"
			type = String
			status = dontcare
			deleted;
		creator.gui.textbox qml431e9e80061146e798d3c7ded3517ed0 "City"
			type = String
			status = dontcare
			deleted;
		creator.gui.dropdown qmldb1212d5a2a849e8a9679bd62a1cf60d "Location"
			type = qmlb2816fa877c040cd98bf5f6c23f25b13
			status = dontcare;
		creator.gui.radiobutton qml876507d22a6e46afa14218fea0ff1179 "Brand"
			type = qmlcf42aa2a48724e6f8b6007c4fa320685
			status = dontcare;
		creator.gui.dropdown qml7296b49bb7094828898da2afd8f6ae50 "regNos"
			type = qml6160cff8dd6f4a08a60955a340ab2ec2
			status = dontcare;
		creator.gui.dropdown qmldebfc07f44e64e53be929be0ee916bd7 "OrderType"
			type = qml7246a51ff9984722aa0b840d3645fd3d
			status = dontcare;
		creator.gui.radiobutton qml54a90ff1d83c4950b568ac7b861ebeca "OrderTime"
			type = qmlc7fb04439f02481a8516775ddfb24910
			status = dontcare;
		creator.gui.button qml7199e804799640e78624dd3f631c2856 "Submit"
			status = dontcare;
		creator.gui.radiobutton qml0f8fbc73ac1b4aba9160c85e3d58f59b "TradeType"
			status = dontcare
			deleted;
		creator.gui.radiobutton qml2f416c54e16446aaa47229e4a7654615 "TradeType"
			type = qml6ff11cb726844c1b868b67a41182c59e
			status = dontcare;
		creator.gui.hyperlink qmlbb27084f39ae4d3293cc315b1d479a4a "TransferRC"
			status = dontcare;
		creator.gui.hyperlink qml7602377e52434d639e7cf972feecdb5e "Buy Insurance"
			status = dontcare;
	}
}
creator.enum qml6ff11cb726844c1b868b67a41182c59e "BuySell"
{
	creator.enumerationvalue qml4178968e0b0a4975b01e7eaa307abc09 "Buy";
	creator.enumerationvalue qml014d104d96fd467aba6aa7d87d7fcc5c "Sell";
}
creator.enum qmlb2816fa877c040cd98bf5f6c23f25b13 "City"
{
	creator.enumerationvalue qml8e04fb5938c6405181dde4fabd0b30fb "Mumbai";
	creator.enumerationvalue qml71afb9ba6e8c421aa662580f7bad13fb "Delhi";
}
creator.enum qmlcf42aa2a48724e6f8b6007c4fa320685 "Brands"
{
	creator.enumerationvalue qml0efcc2d850114928b177f9443aeca81f "BMW";
	creator.enumerationvalue qml3af63374f187490b88b0d04b8f061790 "Mercedes";
	creator.enumerationvalue qml55072725dbd0464f9d5f8e49a18f058a "Audi";
	creator.enumerationvalue qml5a0b93b6d2a04111ab3b804aad0b4413 "Jaguar";
	creator.enumerationvalue qml8b9b3db0653d429ab57e5aa268de4f6d "Honda";
}
creator.enum qml6160cff8dd6f4a08a60955a340ab2ec2 "RegNos"
{
	creator.enumerationvalue qmlbc26e62e4acb4770b67752f89b6add7f "ValidList";
	creator.enumerationvalue qml26d44e8d605343258527e19ce266a799 "InvalidList";
}
creator.enum qml7246a51ff9984722aa0b840d3645fd3d "OrderType"
{
	creator.enumerationvalue qml127c2f1b669d4bedb7733019ef2c6d57 "EBooking";
	creator.enumerationvalue qml2c5196b36728450a95157f5c94bb7468 "InStore";
}
creator.enum qmlc7fb04439f02481a8516775ddfb24910 "OrderTime"
{
	creator.enumerationvalue qml84930c85446c4db0aca94098b14ced64 "DuringWkgHrs";
	creator.enumerationvalue qmlc6f47bc38bb84208aad1071009c58bea "OutsideWkgHrs";
}
creator.gui.screen qml12a9ad073c7e4c66ba5d738cca8ccbff "TrasferRC"
{
	creator.gui.form qml9337f97d524a46978abb889433ce5d13 "TransferRC"
	{
		creator.gui.textbox qmlf76a89def93246c698b31cba4b5541a2 "FromOwner"
			type = String
			status = dontcare;
		creator.gui.textbox qml9961c927479e40df869810d12ee595be "ToBuyer"
			type = String
			status = dontcare;
	}
	creator.gui.button qml48aef514ed34499dbd01388b45680157 "Transfer"
		status = dontcare;
}
creator.gui.screen qmldd664e0079ec447b96157d14ba4c0c5e "InsuranceApplication"
{
}