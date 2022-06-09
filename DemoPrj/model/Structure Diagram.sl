com.conformiq.creator.structure.v15
creator.gui.screen qml291f8e43184b4e6da8715942a8a79db1 "Left Frame"
{
	creator.gui.hyperlink qml8a311ef7f4e9419e85b147352dd15aec "Settings"
		status = dontcare;
	creator.gui.hyperlink qml9a88f67b0c2247b999d1b7adfee85bfa "Home"
		status = dontcare;
	creator.gui.hyperlink qml7344748987a74160932840267a280707 "Our Org"
		status = dontcare;
	creator.gui.hyperlink qml6b9c2167b1094bbf8559b29168734dae "Policies"
		status = dontcare;
	creator.gui.hyperlink qmlbdb494350bb349178106c5e313dcbbcf "MyAttendance"
		status = dontcare;
	creator.gui.hyperlink qml5c8f1f51ebac4d4eb8b922408ed0ca1b "Holidays"
		status = dontcare;
	creator.gui.hyperlink qml38bee79993bf404b9708d19cd3d39b16 "People Connect"
		status = dontcare;
	creator.gui.hyperlink qml2924fef0c55d4d3881b825190be61556 "My Requests"
		status = dontcare;
	creator.gui.hyperlink qmld9227c86818d49a3ae040a2a6396c0fa "Manage Requests"
		status = dontcare;
	creator.gui.hyperlink qml50d2d44472314d9e90f0116fa0a9c95f "Recruitment"
		status = dontcare;
	creator.gui.hyperlink qmlaa10ea359e8341d08fcb819c168bf115 "Performance"
		status = dontcare;
}
creator.gui.popup qml5573d118ef944b7bb79f2302886139a5 "Our Org"
{
	creator.gui.hyperlink qml285cd03558be46a4b222d59ee193e836 "Our Story"
		status = dontcare;
	creator.gui.hyperlink qml9bcc10e1f857468698a3ea028096258e "Our People"
		status = dontcare;
	creator.gui.hyperlink qmlc48036df11a64c84a8abe57c1b992dcb "Our Location"
		status = dontcare;
	creator.gui.hyperlink qml5aa0150c02a34abaad0fb0abd3eb3e9c "Our Clients"
		status = dontcare;
}
creator.gui.popup qmlae2f7a6300b443d1af9914d086fba1bf "My Attendance"
{
	creator.gui.hyperlink qmlbdd2b2d434e54fd1b67f916c761fff72 "Attendance"
		status = dontcare;
	creator.gui.hyperlink qml0f3fe533e11b447f8e2c6d438efb3108 "Leave Details"
		status = dontcare;
	creator.gui.hyperlink qml73dc8bbf16874051a1848e0314699761 "LeaveDetails"
		status = dontcare;
}
creator.gui.screen qmlf6bddea23ac64fc0bf796ace6d3d5d06 "Policies"
{
	creator.gui.form qml1979936c5f114e308c85694bd2b982f8 "PolicyList"
	{
		creator.gui.dropdown qml1464d9fa75aa4360aa342beeacc7b8b9
		"PolicyListByFunction"
			type = qmld448639a2e004458a5f9c99a7ec25aaf
			status = dontcare;
	}
}
creator.gui.screen qml38dec0a7d6ab482381095d898f336a68 "Holidays"
{
	creator.gui.form qml911132cccede4eb680413cac6d5d690e "List Of Policies"
		deleted
	{
		creator.gui.hyperlink qmlb3f265d03e34458c81f5055658b61b9d "unnamed"
			status = dontcare
			deleted;
		creator.gui.dropdown qml7e45dc1b12ff48c4b9b921780d80b6bb "Policy LIst"
			type = qmld448639a2e004458a5f9c99a7ec25aaf
			status = dontcare
			deleted;
	}
	creator.gui.uitable qml54cc12ca231446cc8270439a67764e83 "Calendar Table"
		deleted
	{
	}
	creator.gui.form qml51c6eccf2e9b48b29a224352d69d0e48 "unnamed"
		deleted
	{
		creator.gui.calendar qmlbdefb49b085c4b8b89e8763b7415f7b2 "Jan"
			status = dontcare
			deleted;
	}
}
creator.enum qmld448639a2e004458a5f9c99a7ec25aaf "Policy By Function"
{
	creator.enumerationvalue qmlc242764fbf534c19914757c069239e48 "HR";
	creator.enumerationvalue qml0da24fa2d8dd4fdfa22f5a00b3a989f1 "Finance";
	creator.enumerationvalue qmlc54192be3cb044bcb9127bbdd81526a7 "Operations";
	creator.enumerationvalue qml362c34c4b364400c8a99739bff0a6d07 "Consulting";
	creator.enumerationvalue qmlcb3520ca60134397bef28ff504f18ed0 "unnamed"
		deleted;
}
creator.enum qml00d7e88cab6a4d2c9f0fe29e3dcb7757 "ENu by Policy By Comp"
	deleted
{
}
creator.datatable qml913d58ceb56c406db4ddbe212ad7690b "CalendarDataTable"
	deleted
{
	creator.enumerationcell qml33cff825068c4430bcd33e96abf4f922 "unnamed"
		type = qml097504594b91424fa89a8128ce4923dc
		deleted;
}
creator.enum qml097504594b91424fa89a8128ce4923dc "CalendarData"
	deleted
{
	creator.enumerationvalue qmld7a6337ab53d428eb6033e71b62aa009 "January"
		deleted;
	creator.enumerationvalue qml6f318729e0d5407592839b4eee99bcc3 "Feb"
		deleted;
	creator.enumerationvalue qml56adccb293c546c09d3697200bd84340 "March"
		deleted;
	creator.enumerationvalue qml2c8ed3334cab4270ba04d3f10802f93a "April"
		deleted;
	creator.enumerationvalue qml1d2cb1e7d02c4687b8ad6dde784c8765 "May"
		deleted;
	creator.enumerationvalue qml6182fafc186b45c5971c96869e60c60c "June"
		deleted;
	creator.enumerationvalue qmlcc7cb5e6a3114170be09c9cab4ee9262 "July"
		deleted;
	creator.enumerationvalue qml4cd06a59fb7747be96571c27008dd4ed "Aug"
		deleted;
	creator.enumerationvalue qml482347d6d2fc4114afd26cc89651c69d "Sept"
		deleted;
	creator.enumerationvalue qml97cb8931c37644e8b815cf61a8893495 "Oct"
		deleted;
	creator.enumerationvalue qml26473cda63044eadb3a25b771aabcbb8 "Nov"
		deleted;
	creator.enumerationvalue qmld287799fe9924299b2cc2bcc6a444394 "Dec"
		deleted;
}
creator.gui.screen qmlf46298dd825f4200910492ce8811e175 "Resource Requistions"
{
	creator.gui.labelwidget qmlc83ce1704242462d8daed6c45b9143c6 "ResReqHdr"
		status = dontcare
		initialized
		default = "Resource Requisition";
	creator.gui.hyperlink qmlab79979dfd164545b3d67a07673728a9 "Home"
		status = dontcare;
	creator.gui.button qmle94bd42f77be4a62ae1d0836663bf58e "Add New"
		status = dontcare;
	creator.gui.uitable qml7fbdf47e257543beb698c70adbb357fa
	"Resource Requistion Data" datatable = qmlfd07953dbcf64cf98ccb159f8d20ed08
	{
		creator.gui.button qml1374c23e40204d5c9802d02e4a87d5cf "Cancel"
			status = dontcare;
		creator.gui.button qml1b51f388d1ab4022b41c4ef347bc637e "View"
			status = dontcare;
		creator.gui.button qmlc9a0d1e334344c8dad298bef07a87bd2 "Edit"
			status = dontcare;
		creator.gui.button qml5528cab72bcd41d18ce559476a3bd80c "Delete"
			status = dontcare;
	}
	creator.gui.form qml784089f63a5543b2a32c4576808f9a84 "Search Form"
	{
		creator.gui.textbox qmlace1352face34062a32e61fcb654bff0 "Search"
			type = String
			status = dontcare
			initialized
			default = "";
	}
	creator.gui.button qml8a676390703c41a49b8273c2b77f94a9 "Copy"
		status = dontcare;
	creator.gui.button qmla52e5b3532654f7688457a8aefcda385 "CSV"
		status = dontcare;
	creator.gui.button qml40baec0bb23842cc8c949bddbdbd0ca3 "Excel"
		status = dontcare
		deleted;
	creator.gui.button qml2055299ed2a34255b633bc0ba69314b5 "Excel"
		status = dontcare;
	creator.gui.button qml712b982bcbea46339374d5a7106a6bdf "PDF"
		status = dontcare;
	creator.gui.button qmlf9285bf282a44016872bba426d770edd "Print"
		status = dontcare;
}
creator.datatable qmlfd07953dbcf64cf98ccb159f8d20ed08 "ResourceRequisitionTbl"
{
	creator.primitivecell qmlc59235879b5f422d9bd0a1422be41a7f "NoOfFilled"
		type = number;
	creator.primitivecell qml6b019c4b80c247f1bc3f97afbca06f35 "Requestor"
		type = String;
	creator.primitivecell qmle83ecdd6511549cda73c786b13c7aa5c "LoggedDate"
		type = String;
	creator.primitivecell qml1ee15557537943f4b50e38a94fe3b68b "Position Name"
		type = String;
	creator.primitivecell qml4eff285dd27443bd9d0995ff7df4646c "LOcation"
		type = String;
	creator.primitivecell qml9a87fddffee94435a68e1632e360904e "NoOfPositions"
		type = number;
	creator.primitivecell qmlcb86ad816bb04bccb68a712913327b68 "NoOfApproved"
		type = number;
	creator.primitivecell qml92ab61e0162e42158fde16168db92a6b
	"PositionApprovalStatus"
		type = String
		deleted;
	creator.primitivecell qml1fab7ab6d32d4c7c89421462e15fd92b "StatusChangedBy"
		type = String;
	creator.enumerationcell qml42cb79f868b44f5ba9578ce3d56f0b25
	"PositionApprovalStatus"
		type = qmlef2883768d1444faa59792364fc4b50b;
	creator.primitivecell qmle57db0ed41c04973b3fa4182cfcc3459 "ApproversComments"
		type = String;
	creator.primitivecell qmla9e38b40c3fd493aa88349a725b73493
	"RequestorsComments"
		type = String;
	creator.primitivecell qml8e5bf6daa3a147faa022754f80edae04 "TargetOnBoardDate"
		type = Date;
	creator.primitivecell qmlb8621cf637894bcc9c2fe838f54be066 "unnamed"
		type = String
		deleted;
}
creator.enum qmlef2883768d1444faa59792364fc4b50b "ApprovalStatus"
{
	creator.enumerationvalue qml1f90bf99d8e44d5786f26312c460c8d9 "Approved";
	creator.enumerationvalue qmlaef5c14beae3444b9878fa29050ec197 "Closed";
	creator.enumerationvalue qmlac6b5d63e42b49ecb9c4384989b7ded5 "Rejected";
	creator.enumerationvalue qml3470872c3d2e4df1aad96c5311275a68 "Pending";
}
creator.customaction qml959aab6b0bb741678cca0469e3672ecf "unnamed"
	direction = in
	deleted
{
}
creator.gui.popup qmlecf7218aa227475395f0c61165330c95 "People Connect"
{
	creator.gui.hyperlink qmlac4dbc4ff8f14afc9707f75644e893a0 "My Recruitment"
		status = dontcare;
	creator.gui.hyperlink qml28c6a20e856f4dacb6aef3c8ccbd93ee "Performance Mgmt"
		status = dontcare;
	creator.gui.button qml25e4872292434f82b0730dc313715f6b "Hall of Fame"
		status = dontcare
		deleted;
	creator.gui.hyperlink qml06ba466185fc4d878eab6670b6388199 "Hall of Fame"
		status = dontcare;
}
creator.gui.popup qml441d8dffce584ade831290003445f64e "MyRecruitment"
{
	creator.gui.hyperlink qmle39e48a7ad884799ab53c4420584d773
	"Resource Requisition"
		status = dontcare;
	creator.gui.hyperlink qml4605939b7c934ad3b3484645189607d3 "Open Positions"
		status = dontcare;
	creator.gui.hyperlink qml5b3ea7e191d54d19a6b25aabefd4a7ca
	"My Candidate Schedule"
		status = dontcare;
	creator.gui.hyperlink qml0e173eac72004d63a747988f63e1f549 "Onboarding"
		status = dontcare;
}
creator.gui.screen qml7236ddf7c66a4342b97fa036bfda34cf "Login Screen"
{
	creator.gui.form qml2807c9bc88cc46afa36d84d3744d4100 "Login Form"
	{
		creator.gui.textbox qml01dabd92167847e2b31bcc5b2e924ad5 "UserName"
			type = String
			status = dontcare;
		creator.gui.textbox qml852f2502b9be447d9347ceaa1405a3b9 "Password"
			type = String
			status = dontcare
			deleted;
		creator.gui.textbox qmlae96f36a724d46fd98af001781599842 "Company"
			type = String
			status = dontcare
			initialized
			default = "abc";
		creator.gui.textbox qml11e923bb5d704307b0f337cba190bc8d "Password"
			type = String
			status = dontcare
			initialized
			default = "";
	}
	creator.gui.button qml37e2c23deb424733b1e11b4285f0fbfb "Sign In"
		status = dontcare;
	creator.gui.labelwidget qml8be83c4efc4e474484aae9dbce697ea7 "ErrorMsg"
		status = dontcare;
}
creator.gui.screen qml59878548d694436fba922864eb5b3a44 "Home Screen"
{
	creator.gui.group qml136cc406780542a8b6a83baa68435f40 "Home Screen Elements"
		deleted
	{
	}
	creator.gui.tab qmleb32d95dd78e4444970527d2479f3e1f "Left Menu"
	{
	}
	creator.gui.tab qml3c2c44af950f45b690833f2456e50f79 "Navigation Bar"
	{
	}
	creator.gui.tab qml041ea1daa3834a0799018fc8be6baddd "MiddleFrame"
		selected
	{
	}
	creator.gui.tab qmlcc8df3c038a04d3aae565d083adf3ab5 "Right Frame"
	{
	}
	creator.gui.hyperlink qml8c2f3975f25c4faeaad4b8f778f80907 "OpenAcc"
		status = dontcare;
	creator.gui.hyperlink qmla87356fc6a2a4065a35068a7566dc1f3 "TransferFunds"
		status = dontcare;
	creator.gui.hyperlink qmlfa42a4b65b1448fea94d14519bd41f88 "Logout"
		status = dontcare;
}
creator.gui.popup qmlf48a24f8e6b54e679ad2fa86be46950d "Error Pop Up"
{
	creator.gui.labelwidget qmlb98d84977e2748bfbc8fa7ca24d84d88 "Error Message"
		status = dontcare;
}
creator.customaction qml5f4d2b0fa579459dba65a66f04fee1b0 "HolidayCustomAction"
	interfaces = [ qml617cab1c9f294e67b66259c9accab9fa ]
	shortform = "HC"
	direction = out
	tokens = [ literal "For the selected month " reference
qmle088620690b046c3a775b23d95522c22 literal "Verify the holidays are as below"
reference qmlba4503f6f4764f2db9f24f07f3f54435 reference
qml67762a4756c94f8b85adc07ef57f4c8f reference
qml043dba43ead74f07b5fa6f8433b611fe ]
{
	creator.primitivefield qmlba4503f6f4764f2db9f24f07f3f54435 "Holiday1"
		type = String;
	creator.primitivefield qml67762a4756c94f8b85adc07ef57f4c8f "Holiday2"
		type = String;
	creator.primitivefield qml043dba43ead74f07b5fa6f8433b611fe "Holiday3"
		type = String;
	creator.primitivefield qmle088620690b046c3a775b23d95522c22 "Month"
		type = String;
}
creator.externalinterface qml617cab1c9f294e67b66259c9accab9fa "HolidayIF"
	direction = out;
creator.externalinterface qml48c0932fa0ea4632a8c9e1b5799c70a2 "ClipBoard"
	direction = out
	deleted;
creator.externalinterface qml5c844d2288eb497d984460ce351b2621 "Printer"
	direction = out
	deleted;
creator.externalinterface qml399ab23457d54932a461882823090c6c "ExcelFile"
	direction = out
	deleted;
creator.externalinterface qml6e8b198f9ac947f8aaa715b5d4c4f650 "PDFFile"
	direction = out
	deleted;
creator.externalinterface qml5a0f1ec21b814f5688d932b86717a1dc "CSVFile"
	direction = out
	deleted;
creator.customaction qmleccc7e419a014b7e929e1c329f36b731 "unnamed"
	direction = in
	deleted
{
}
creator.customaction qml0b5bc1e42c4b4ac28673616e0c13f3b3 "CopyToClipboard"
	interfaces = [ qml48c0932fa0ea4632a8c9e1b5799c70a2
	deleted ]
	direction = in
	deleted
{
	creator.primitivefield qmlf7ba95e7ae1f4ba79ec712dbb88719ca "unnamed"
		type = String
		initialized
		default = ""
		deleted;
}
creator.customaction qmlf290ff9bd6314b6f86946cf6b32c21bc "ExportToExcel"
	interfaces = [ qml399ab23457d54932a461882823090c6c
	deleted ]
	shortform = ""
	direction = in
	deleted
{
}
creator.customaction qml537dc62026b04a2a8340c4e9103e37c9 "PDFExport"
	interfaces = [ qml6e8b198f9ac947f8aaa715b5d4c4f650
	deleted ]
	direction = in
	deleted
{
}
creator.customaction qml4691702e255e4520be3b33b5071aa1c5 "CSVExport"
	interfaces = [ qml5a0f1ec21b814f5688d932b86717a1dc
	deleted ]
	direction = in
	deleted
{
}
creator.customaction qml2640263d35364df98d5674f304a6386b "Print"
	interfaces = [ qml5c844d2288eb497d984460ce351b2621
	deleted ]
	direction = in
	deleted
{
}
creator.datatable qmlaf15d84c1fde42f4ae5f8bf65d85fe9b "UsersDetails"
{
	creator.primitivecell qml13eff265f4bc4a8ba958788ea6225f18 "userName"
		type = String;
	creator.primitivecell qmlf5d3a65ce71849fc958d0fa8a11e797b "password"
		type = String;
	creator.primitivecell qml0d28d18ab6fb433b95c975ecb83e5b57 "userType"
		type = String;
	creator.primitivecell qmld488026ea3b44bb8ae7e8092f289425f "manager"
		type = String
		deleted;
	creator.enumerationcell qml2ff411687fb5429b9b019e509d7cefb7 "unnamed"
		deleted;
	creator.primitivecell qml3d940af7d0984cd687ecc716f7aa7a1a "manager"
		type = boolean;
	creator.primitivecell qml7ed792047f4440d7acea2107e67e91e5 "company"
		type = String;
}
creator.customaction qml95fcbff5c4f546c18ab7bd10897ed16a "VerifySavedFile"
	interfaces = [ qml4ee8c4ef02764ba8ae989c214de5ead8
qml9074593eedc34f82b9240ccea2351e59
	deleted ]
	shortform = "VS"
	direction = out
	tokens = [ literal
"Verify that a file of the following type is saved into the filesystem"
reference qmld2f8762b3c794730ac72322f3acb7e0f ]
{
	creator.enumerationfield qml90bfdee95cb246b4b395995909745f5f "EIFType"
		type = qml817c26a2f3644951a33dbe0cf9652f66
		deleted;
	creator.primitivefield qml6fc971d72dfa4d16a91d28d008a556cb "FileType"
		type = String
		deleted;
	creator.enumerationfield qmld2f8762b3c794730ac72322f3acb7e0f "FileType"
		type = qmla6ec79246c804a688f602d91c72795fd;
}
creator.externalinterface qml9074593eedc34f82b9240ccea2351e59 "Clipboard"
	direction = out
	deleted;
creator.enum qml817c26a2f3644951a33dbe0cf9652f66 "EIFType"
	deleted
{
	creator.enumerationvalue qmlc2104d425d784fd993ed0c277f0ffdfc "ClipBoard"
		deleted;
	creator.enumerationvalue qmlbb4262b096fd44638fef647c3e8b9d54 "CSV"
		deleted;
	creator.enumerationvalue qml1a096997418c42e69d136db97bc6ca58 "Excel"
		deleted;
	creator.enumerationvalue qml1421063e9faf4160adfedc517e7af67b "PDF"
		deleted;
}
creator.gui.screen qmldda5ad9d08b2477b8aeb2118bce0674a "ConformiqLeftMenu"
{
	creator.gui.treenode qml23571767e6bc4a868c2cab249bfa08cd "DemoPrj"
	{
		creator.gui.treenode qml4b62ad021ae84047a87deaa565f1e994 "DC"
		{
			creator.gui.treenode qmla31643209b9d4408bac437983c3abd83 "Excel"
			{
			}
		}
		creator.gui.treenode qml8b71af6d6db94cc7937e90d2d7acf610 "COpt"
		{
		}
	}
}
creator.gui.screen qml542dd1b1a1934d5989719f5619aa596a
"MakeMyTripSearchResults"
	deleted
{
	creator.gui.uitable qmle83f643dd0ea4e7da14669e8e0ff0230 "SearchResults"
	datatable = qml28eed1acd1784d1c8716279f7a1848bc
		deleted
	{
		creator.gui.button qml5273e005013449f98a5b902498f3c591 "ViewFlightDetails"
			status = dontcare
			deleted;
		creator.gui.button qmlea0b3ae2f71a451f831a5d7c40245d45 "BookFlight"
			status = dontcare
			deleted;
	}
}
creator.datatable qml28eed1acd1784d1c8716279f7a1848bc "FlightData"
{
	creator.primitivecell qml2d8329d311f9402aa6a3df04e59575d1 "FlightNo"
		type = String;
	creator.primitivecell qml2ae588e54d23436dba1849c9094a566e "From"
		type = String;
	creator.primitivecell qml6dbc7926a755464a9b78e5298da9c790 "DepDateTime"
		type = String;
	creator.primitivecell qml0cd8bb82c5bf42208f448aa5dbb84797 "To"
		type = String;
	creator.primitivecell qml7ff210acee234773a5c623b2712e90c9 "ArrDateTime"
		type = String;
	creator.primitivecell qml6de43b0f420c4482bcf1d84b8b776912 "Fare"
		type = String;
}
creator.gui.screen qmlab7a842181654fb899237684eb87d49c "FlightSearch"
	deleted
{
	creator.gui.form qmlac97234ba6fb4cddaa100b59541b76f0 "FlightDtls"
		deleted
	{
		creator.gui.textbox qmlebc0912d7c844ed7b24d1a5b579854a4 "From"
			type = String
			status = dontcare
			deleted;
		creator.gui.textbox qml46a7bc6ddd8d4b3d86e60d6cf2531d20 "To"
			type = String
			status = dontcare
			deleted;
		creator.gui.textbox qmlff4b73cb8747455dacfad71d4708344e "DateTime"
			type = String
			status = dontcare
			deleted;
		creator.gui.button qml1650e5f3537b4feeb74babf5b8245527 "Search"
			status = dontcare
			deleted;
	}
}
creator.message qml3fa2c4a26d92422a886132de35e4f645 "LoginReq"
	interfaces = [ qmlaecf5f4c4bea4474bfd402b287f3c3ac ]
{
	creator.primitivefield qmlfc5f67914fee4dc7955d94a6a309696e "UserName"
		type = String;
	creator.primitivefield qmleb36ac51adbf4a009ec7b1034a518fa6 "Password"
		type = String;
	creator.primitivefield qml18c0584676ac4bef9883491dfb4a279d "Company"
		type = String
		deleted;
}
creator.externalinterface qmlaecf5f4c4bea4474bfd402b287f3c3ac "ADSO"
	direction = out;
creator.message qml826dc1202c89467380fd38c866ee5524 "LoginResponse"
	interfaces = [ qmlc389adecdcd3409b9a858ad0668ec1ae ]
{
	creator.primitivefield qml54a1985f6dd1488f90b2d4ecb48c6bf3 "Username"
		type = String;
	creator.primitivefield qmlb662d13df1b34813855a53989abeae1a "Password"
		type = String;
	creator.primitivefield qml4bb79bd028854a9b9fc00a42aaf8cc78 "Role"
		type = String;
	creator.primitivefield qml474e27888fcf44a3a0b2cf0b46f0db00 "AccessRights"
		type = String;
}
creator.externalinterface qmlc389adecdcd3409b9a858ad0668ec1ae "ADSI"
	direction = in;
creator.externalinterface qml9904798d20d2498fb88bf3b563731041
"NewCustomAction"
	direction = in
	deleted;
creator.externalinterface qml1340267790314426af0ad3c08174e27f "Outlook"
	direction = in;
creator.externalinterface qml501785fd932c43edb5d92fec2dbc459c "Citrix"
	direction = in;
creator.customaction qml9e51666a045a4b889a5170d8c458d420 "CustomAction"
	interfaces = [ qml501785fd932c43edb5d92fec2dbc459c
	deleted ]
	shortform = "EI"
	direction = in
	deleted
{
}
creator.customaction qml0b2aa4517398460fb0acdabc0421c2a1 "OpenBrowserInCitrx"
	interfaces = [ qml501785fd932c43edb5d92fec2dbc459c ]
	shortform = "EC"
	direction = in
	tokens = [ literal "Launch the browser with the given url" reference
qml63568bcd9f444877abd82495b764ce78 ]
{
	creator.primitivefield qml63568bcd9f444877abd82495b764ce78 "URL"
		type = String;
}
creator.externalinterface qml4ee8c4ef02764ba8ae989c214de5ead8 "FileSystem"
	direction = out;
creator.enum qmlf70d50cd45a84bde84b35367f6920bbf ""
	deleted
{
}
creator.enum qmla6ec79246c804a688f602d91c72795fd "FileTypes"
{
	creator.enumerationvalue qmle28cb994073a4dd48b0c8b75bdbc8c26 "CSV";
	creator.enumerationvalue qml6597dcfb9f194b71a9bdfad60d21cd8f "Excel";
	creator.enumerationvalue qmldc0032c4634346bc8cc7fbe546a4dbe4 "ClipBoard"
		deleted;
	creator.enumerationvalue qml72a792725638496097f414664095a336 "PDF";
}
creator.gui.screen qml6d254ecffd134478bf8205ffa9556ea9 "OpenAcc"
{
	creator.gui.form qmle08f3c35fd194b8883fdac8a5126d668 "AccOpeningForm"
	{
		creator.gui.textbox qmlfca70ccfb83943e2a379234b9bb0f0fe "AccType"
			type = String
			status = dontcare;
		creator.gui.textbox qmlfd92b6a3509543a68558ac377bd59fd4 "AccNo"
			type = String
			status = dontcare;
		creator.gui.button qml56a7db467e8641dabe8d5e561558a87b "Submit"
			status = dontcare;
	}
	creator.gui.hyperlink qml91f105686c2e4f84959efd9d6d8437de "Logout"
		status = dontcare;
}
creator.gui.screen qml21b22bfc98a747e38e437a595c853541 "Transfer Funds"
{
	creator.gui.form qml858d7c7c6a484bde9cb4c30d3a58e70f "TrfrFunds"
	{
		creator.gui.button qmlf374fd363a4941a0bde2fc648a25db0d "unnamed"
			status = dontcare
			deleted;
		creator.gui.button qmld0eea3f7b0c3445d8e31ebce108ebb99 "FromAccNo"
			status = dontcare
			deleted;
		creator.gui.labelwidget qml507b374671c64901946ea5b0b3190f95 "unnamed"
			status = dontcare
			deleted;
		creator.gui.textbox qml6f153c52ca51440d91fe6f56fb3802ad "unnamed"
			type = String
			status = dontcare
			deleted;
		creator.gui.textbox qml8df44b9062354a969c610ff2a864086a "FromAcc"
			type = String
			status = dontcare;
		creator.gui.textbox qml5697b839943c4728a9c377f1c405f394 "ToAcc"
			type = String
			status = dontcare;
		creator.gui.textbox qml98277635316d427282a3f151e68b5893 "Amount"
			type = String
			status = dontcare;
		creator.gui.button qmlbf93e85fb69a41feac8a99770254be47 "Transfer"
			status = dontcare;
	}
	creator.gui.hyperlink qml6abd93c97e874590a4bb3763881e8777 "Logout"
		status = dontcare;
}
creator.gui.screen qmldd9bc83cd09545e79d801095c81e5087
"Google Authenticator on Mobile"
{
	creator.gui.form qml85e013b33d5248499a381d8d683e1d90 "GoogleNotification"
	{
		creator.gui.button qml54238e23a7d44c59850524b67dc6269a "Approve"
			status = dontcare;
		creator.gui.labelwidget qml7a6486240f584251873124c41adcacf0
		"Authentication Alert Msg"
			status = dontcare;
		creator.gui.textbox qml5b795e1def674ffdbcfea12edb1a52f2 "unnamed"
			type = String
			status = dontcare
			deleted;
		creator.gui.checkbox qmle997f148077f4c699155a40e39b15ed5 "I agree"
			status = dontcare
			checked = dontcare;
	}
}
creator.gui.screen qml35fce10e49254147b6dd4d3a9d70036a "FlightSearch"
{
	creator.gui.form qml3d1bdf06118b45aeb2760c0c30e7d8af "FlightSearch"
	{
		creator.gui.textbox qml7435230b932445b8a490a4d61725032a "From"
			type = String
			status = dontcare;
		creator.gui.textbox qml61dcbd5485314de8a9be0f0a3c053a4f "To"
			type = String
			status = dontcare;
		creator.gui.textbox qml2640a1884f70437eadc1148caf73b799 "DateOfTravel"
			type = String
			status = dontcare;
		creator.gui.button qml7127ea1e978940afaf1b689eafc02304 "Search"
			status = dontcare;
	}
}
creator.gui.screen qmlc94f3d3ac0d844808c02d54c64aa11b2 "FlightSearchResults"
{
	creator.gui.uitable qml0e342f4d06f34ea48ecb8f51f8555b80
	"FlightSearchResultsTbl" datatable = qml28eed1acd1784d1c8716279f7a1848bc
	{
		creator.gui.button qml76ba64ebe07b4f8e87d56109c234e61b "FlightInfo"
			status = dontcare;
		creator.gui.button qml954d66b60b924545bddf4770980db67e "Book"
			status = dontcare;
	}
}