com.conformiq.creator.structure.v15
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_initializeDB__0
"SOAP Envelope for initializeDB"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__in__0 ]
{
	creator.structuredfield
	qml_wsdl_import__initializeDB_32_message__sfield__Header__0 "Header"
		type = qml_wsdl_import__seq__SOAP_32_Header_32_for_32_initializeDB__0
		optional;
	creator.structuredfield
	qml_wsdl_import__initializeDB_32_message__sfield__Body__0 "Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_initializeDB__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_initializeDB__0
"SOAP Header for initializeDB"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_initializeDB__0
"SOAP Body for initializeDB"
{
	creator.structuredfield
	qml_wsdl_import__initializeDB_32_body__sfield__initializeDB__0 "initializeDB"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__initializeDB__0;
}
creator.sequencetype qml_wsdl_import__seq__initializeDB__0 "initializeDB"
	namespace = "http://service.parabank.parasoft.com/"
{
}
creator.externalinterface
qml_wsdl_import__port__ParaBankServiceImplPort__in__0
"ParaBankServiceImplPort_in"
	annotations = [ "wsdl:port" = "ParaBankServiceImplPort";
"soap:address" =
"http://parabank.conformiq.com/parabank/services/ParaBank;jsessionid=FABF82DA743522AA997C97A82074E7BE";
"soap:version" = "1.1";
]
	direction = in;
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_initializeDBResponse__0
"SOAP Envelope for initializeDBResponse"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__out__0 ]
{
	creator.structuredfield
	qml_wsdl_import__initializeDBResponse_32_message__sfield__Header__0 "Header"
		type =
	qml_wsdl_import__seq__SOAP_32_Header_32_for_32_initializeDBResponse__0
		optional;
	creator.structuredfield
	qml_wsdl_import__initializeDBResponse_32_message__sfield__Body__0 "Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_initializeDBResponse__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_initializeDBResponse__0
"SOAP Header for initializeDBResponse"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_initializeDBResponse__0
"SOAP Body for initializeDBResponse"
{
	creator.structuredfield
	qml_wsdl_import__initializeDBResponse_32_body__sfield__initializeDBResponse__0
	"initializeDBResponse"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__initializeDBResponse__0;
}
creator.sequencetype qml_wsdl_import__seq__initializeDBResponse__0
"initializeDBResponse"
	namespace = "http://service.parabank.parasoft.com/"
{
}
creator.externalinterface
qml_wsdl_import__port__ParaBankServiceImplPort__out__0
"ParaBankServiceImplPort_out"
	annotations = [ "wsdl:port" = "ParaBankServiceImplPort";
"soap:address" =
"http://parabank.conformiq.com/parabank/services/ParaBank;jsessionid=FABF82DA743522AA997C97A82074E7BE";
"soap:version" = "1.1";
]
	direction = out;
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_getTransactionsOnDate__0
"SOAP Envelope for getTransactionsOnDate"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__in__0 ]
{
	creator.structuredfield
	qml_wsdl_import__getTransactionsOnDate_32_message__sfield__Header__0 "Header"
		type =
	qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getTransactionsOnDate__0
		optional;
	creator.structuredfield
	qml_wsdl_import__getTransactionsOnDate_32_message__sfield__Body__0 "Body"
		type =
	qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getTransactionsOnDate__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getTransactionsOnDate__0
"SOAP Header for getTransactionsOnDate"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getTransactionsOnDate__0
"SOAP Body for getTransactionsOnDate"
{
	creator.structuredfield
	qml_wsdl_import__getTransactionsOnDate_32_body__sfield__getTransactionsOnDate__0
	"getTransactionsOnDate"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__getTransactionsOnDate__0;
}
creator.sequencetype qml_wsdl_import__seq__getTransactionsOnDate__0
"getTransactionsOnDate"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.primitivefield
	qml_wsdl_import__getTransactionsOnDate__pfield__accountId__0 "accountId"
		namespace = "http://service.parabank.parasoft.com/"
		type = number;
	creator.primitivefield
	qml_wsdl_import__getTransactionsOnDate__pfield__onDate__0 "onDate"
		namespace = "http://service.parabank.parasoft.com/"
		type = String;
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_getTransactionsOnDateResponse__0
"SOAP Envelope for getTransactionsOnDateResponse"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__out__0 ]
{
	creator.structuredfield
	qml_wsdl_import__getTransactionsOnDateResponse_32_message__sfield__Header__0
	"Header"
		type =
	qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getTransactionsOnDateResponse__0
		optional;
	creator.structuredfield
	qml_wsdl_import__getTransactionsOnDateResponse_32_message__sfield__Body__0
	"Body"
		type =
	qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getTransactionsOnDateResponse__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getTransactionsOnDateResponse__0
"SOAP Header for getTransactionsOnDateResponse"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getTransactionsOnDateResponse__0
"SOAP Body for getTransactionsOnDateResponse"
{
	creator.structuredfield
	qml_wsdl_import__getTransactionsOnDateResponse_32_body__sfield__getTransactionsOnDateResponse__0
	"getTransactionsOnDateResponse"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__getTransactionsOnDateResponse__0;
}
creator.sequencetype qml_wsdl_import__seq__getTransactionsOnDateResponse__0
"getTransactionsOnDateResponse"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.structuredfield
	qml_wsdl_import__getTransactionsOnDateResponse__sfield__transaction__0
	"transaction"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__transaction__0 array;
}
creator.sequencetype qml_wsdl_import__seq__transaction__0 "transaction"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.primitivefield qml_wsdl_import__transaction__pfield__id__0 "id"
		type = number;
	creator.primitivefield qml_wsdl_import__transaction__pfield__accountId__0
	"accountId"
		type = number;
	creator.enumerationfield qml_wsdl_import__transaction__enumfield__type__0
	"type"
		annotations = [ "xsd:minOccurs" = "0";
	]
		type = qml_wsdl_import__enum__transactionType__0
		optional;
	creator.primitivefield qml_wsdl_import__transaction__pfield__date__0 "date"
		annotations = [ "xsd:minOccurs" = "0";
	]
		type = String
		optional;
	creator.primitivefield qml_wsdl_import__transaction__pfield__amount__0
	"amount"
		annotations = [ "xsd:minOccurs" = "0";
	]
		type = String
		optional;
	creator.primitivefield qml_wsdl_import__transaction__pfield__description__0
	"description"
		annotations = [ "xsd:minOccurs" = "0";
	]
		type = String
		optional;
}
creator.enum qml_wsdl_import__enum__transactionType__0 "transactionType"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.enumerationvalue qml_wsdl_import__transactionType__enumval__Credit__0
	"Credit";
	creator.enumerationvalue qml_wsdl_import__transactionType__enumval__Debit__0
	"Debit";
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_ParaBankServiceException__0
"SOAP Envelope for ParaBankServiceException"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__out__0 ]
{
	creator.structuredfield
	qml_wsdl_import__ParaBankServiceException_32_message__sfield__Header__0
	"Header"
		type =
	qml_wsdl_import__seq__SOAP_32_Header_32_for_32_ParaBankServiceException__0
		optional;
	creator.structuredfield
	qml_wsdl_import__ParaBankServiceException_32_message__sfield__Body__0 "Body"
		type =
	qml_wsdl_import__seq__SOAP_32_Body_32_for_32_ParaBankServiceException__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_ParaBankServiceException__0
"SOAP Header for ParaBankServiceException"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_ParaBankServiceException__0
"SOAP Body for ParaBankServiceException"
{
	creator.structuredfield
	qml_wsdl_import__ParaBankServiceException_32_body__sfield__Fault__0 "Fault"
		type =
	qml_wsdl_import__seq__SOAP_32_Fault_32_for_32_ParaBankServiceException__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Fault_32_for_32_ParaBankServiceException__0
"SOAP Fault for ParaBankServiceException"
{
	creator.primitivefield
	qml_wsdl_import__ParaBankServiceException_32_body__pfield__faultcode__0
	"faultcode"
		type = String;
	creator.primitivefield
	qml_wsdl_import__ParaBankServiceException_32_body__pfield__faultstring__0
	"faultstring"
		type = String;
	creator.primitivefield
	qml_wsdl_import__ParaBankServiceException_32_body__pfield__faultactor__0
	"faultactor"
		type = String
		optional;
	creator.structuredfield
	qml_wsdl_import__ParaBankServiceException_32_body__sfield__detail__0 "detail"
		type =
	qml_wsdl_import__seq__SOAP_32_Fault_32_Detail_32_for_32_ParaBankServiceException__0
		optional;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Fault_32_Detail_32_for_32_ParaBankServiceException__0
"SOAP Fault Detail for ParaBankServiceException"
{
	creator.structuredfield
	qml_wsdl_import__ParaBankServiceException_32_fault__sfield__ParaBankServiceException__0
	"ParaBankServiceException"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__ParaBankServiceException__0;
}
creator.sequencetype qml_wsdl_import__seq__ParaBankServiceException__0
"ParaBankServiceException"
	namespace = "http://service.parabank.parasoft.com/"
{
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_getPositionHistory__0
"SOAP Envelope for getPositionHistory"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__in__0 ]
{
	creator.structuredfield
	qml_wsdl_import__getPositionHistory_32_message__sfield__Header__0 "Header"
		type = qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getPositionHistory__0
		optional;
	creator.structuredfield
	qml_wsdl_import__getPositionHistory_32_message__sfield__Body__0 "Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getPositionHistory__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getPositionHistory__0
"SOAP Header for getPositionHistory"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getPositionHistory__0
"SOAP Body for getPositionHistory"
{
	creator.structuredfield
	qml_wsdl_import__getPositionHistory_32_body__sfield__getPositionHistory__0
	"getPositionHistory"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__getPositionHistory__0;
}
creator.sequencetype qml_wsdl_import__seq__getPositionHistory__0
"getPositionHistory"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.primitivefield
	qml_wsdl_import__getPositionHistory__pfield__positionId__0 "positionId"
		namespace = "http://service.parabank.parasoft.com/"
		type = number;
	creator.primitivefield
	qml_wsdl_import__getPositionHistory__pfield__startDate__0 "startDate"
		namespace = "http://service.parabank.parasoft.com/"
		type = String;
	creator.primitivefield
	qml_wsdl_import__getPositionHistory__pfield__endDate__0 "endDate"
		namespace = "http://service.parabank.parasoft.com/"
		type = String;
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_getPositionHistoryResponse__0
"SOAP Envelope for getPositionHistoryResponse"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__out__0 ]
{
	creator.structuredfield
	qml_wsdl_import__getPositionHistoryResponse_32_message__sfield__Header__0
	"Header"
		type =
	qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getPositionHistoryResponse__0
		optional;
	creator.structuredfield
	qml_wsdl_import__getPositionHistoryResponse_32_message__sfield__Body__0
	"Body"
		type =
	qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getPositionHistoryResponse__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getPositionHistoryResponse__0
"SOAP Header for getPositionHistoryResponse"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getPositionHistoryResponse__0
"SOAP Body for getPositionHistoryResponse"
{
	creator.structuredfield
	qml_wsdl_import__getPositionHistoryResponse_32_body__sfield__getPositionHistoryResponse__0
	"getPositionHistoryResponse"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__getPositionHistoryResponse__0;
}
creator.sequencetype qml_wsdl_import__seq__getPositionHistoryResponse__0
"getPositionHistoryResponse"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.structuredfield
	qml_wsdl_import__getPositionHistoryResponse__sfield__historyPoint__0
	"historyPoint"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__historyPoint__0 array;
}
creator.sequencetype qml_wsdl_import__seq__historyPoint__0 "historyPoint"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.primitivefield qml_wsdl_import__historyPoint__pfield__symbol__0
	"symbol"
		annotations = [ "xsd:minOccurs" = "0";
	]
		type = String
		optional;
	creator.primitivefield qml_wsdl_import__historyPoint__pfield__date__0 "date"
		annotations = [ "xsd:minOccurs" = "0";
	]
		type = String
		optional;
	creator.primitivefield qml_wsdl_import__historyPoint__pfield__closingPrice__0
	"closingPrice"
		annotations = [ "xsd:minOccurs" = "0";
	]
		type = String
		optional;
}
creator.message qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_transfer__0
"SOAP Envelope for transfer"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__in__0 ]
{
	creator.structuredfield
	qml_wsdl_import__transfer_32_message__sfield__Header__0 "Header"
		type = qml_wsdl_import__seq__SOAP_32_Header_32_for_32_transfer__0
		optional;
	creator.structuredfield qml_wsdl_import__transfer_32_message__sfield__Body__0
	"Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_transfer__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_transfer__0
"SOAP Header for transfer"
{
}
creator.sequencetype qml_wsdl_import__seq__SOAP_32_Body_32_for_32_transfer__0
"SOAP Body for transfer"
{
	creator.structuredfield
	qml_wsdl_import__transfer_32_body__sfield__transfer__0 "transfer"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__transfer__0;
}
creator.sequencetype qml_wsdl_import__seq__transfer__0 "transfer"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.primitivefield qml_wsdl_import__transfer__pfield__fromAccountId__0
	"fromAccountId"
		namespace = "http://service.parabank.parasoft.com/"
		type = number;
	creator.primitivefield qml_wsdl_import__transfer__pfield__toAccountId__0
	"toAccountId"
		namespace = "http://service.parabank.parasoft.com/"
		type = number;
	creator.primitivefield qml_wsdl_import__transfer__pfield__amount__0 "amount"
		namespace = "http://service.parabank.parasoft.com/"
		type = String;
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_transferResponse__0
"SOAP Envelope for transferResponse"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__out__0 ]
{
	creator.structuredfield
	qml_wsdl_import__transferResponse_32_message__sfield__Header__0 "Header"
		type = qml_wsdl_import__seq__SOAP_32_Header_32_for_32_transferResponse__0
		optional;
	creator.structuredfield
	qml_wsdl_import__transferResponse_32_message__sfield__Body__0 "Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_transferResponse__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_transferResponse__0
"SOAP Header for transferResponse"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_transferResponse__0
"SOAP Body for transferResponse"
{
	creator.structuredfield
	qml_wsdl_import__transferResponse_32_body__sfield__transferResponse__0
	"transferResponse"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__transferResponse__0;
}
creator.sequencetype qml_wsdl_import__seq__transferResponse__0
"transferResponse"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.primitivefield
	qml_wsdl_import__transferResponse__pfield__transferReturn__0 "transferReturn"
		namespace = "http://service.parabank.parasoft.com/"
		type = String;
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_getTransaction__0
"SOAP Envelope for getTransaction"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__in__0 ]
{
	creator.structuredfield
	qml_wsdl_import__getTransaction_32_message__sfield__Header__0 "Header"
		type = qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getTransaction__0
		optional;
	creator.structuredfield
	qml_wsdl_import__getTransaction_32_message__sfield__Body__0 "Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getTransaction__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getTransaction__0
"SOAP Header for getTransaction"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getTransaction__0
"SOAP Body for getTransaction"
{
	creator.structuredfield
	qml_wsdl_import__getTransaction_32_body__sfield__getTransaction__0
	"getTransaction"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__getTransaction__0;
}
creator.sequencetype qml_wsdl_import__seq__getTransaction__0 "getTransaction"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.primitivefield
	qml_wsdl_import__getTransaction__pfield__transactionId__0 "transactionId"
		namespace = "http://service.parabank.parasoft.com/"
		type = number;
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_getTransactionResponse__0
"SOAP Envelope for getTransactionResponse"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__out__0 ]
{
	creator.structuredfield
	qml_wsdl_import__getTransactionResponse_32_message__sfield__Header__0
	"Header"
		type =
	qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getTransactionResponse__0
		optional;
	creator.structuredfield
	qml_wsdl_import__getTransactionResponse_32_message__sfield__Body__0 "Body"
		type =
	qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getTransactionResponse__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getTransactionResponse__0
"SOAP Header for getTransactionResponse"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getTransactionResponse__0
"SOAP Body for getTransactionResponse"
{
	creator.structuredfield
	qml_wsdl_import__getTransactionResponse_32_body__sfield__getTransactionResponse__0
	"getTransactionResponse"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__getTransactionResponse__0;
}
creator.sequencetype qml_wsdl_import__seq__getTransactionResponse__0
"getTransactionResponse"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.structuredfield
	qml_wsdl_import__getTransactionResponse__sfield__transaction__0 "transaction"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__transaction__0;
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_shutdownJmsListener__0
"SOAP Envelope for shutdownJmsListener"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__in__0 ]
{
	creator.structuredfield
	qml_wsdl_import__shutdownJmsListener_32_message__sfield__Header__0 "Header"
		type = qml_wsdl_import__seq__SOAP_32_Header_32_for_32_shutdownJmsListener__0
		optional;
	creator.structuredfield
	qml_wsdl_import__shutdownJmsListener_32_message__sfield__Body__0 "Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_shutdownJmsListener__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_shutdownJmsListener__0
"SOAP Header for shutdownJmsListener"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_shutdownJmsListener__0
"SOAP Body for shutdownJmsListener"
{
	creator.structuredfield
	qml_wsdl_import__shutdownJmsListener_32_body__sfield__shutdownJmsListener__0
	"shutdownJmsListener"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__shutdownJmsListener__0;
}
creator.sequencetype qml_wsdl_import__seq__shutdownJmsListener__0
"shutdownJmsListener"
	namespace = "http://service.parabank.parasoft.com/"
{
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_shutdownJmsListenerResponse__0
"SOAP Envelope for shutdownJmsListenerResponse"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__out__0 ]
{
	creator.structuredfield
	qml_wsdl_import__shutdownJmsListenerResponse_32_message__sfield__Header__0
	"Header"
		type =
	qml_wsdl_import__seq__SOAP_32_Header_32_for_32_shutdownJmsListenerResponse__0
		optional;
	creator.structuredfield
	qml_wsdl_import__shutdownJmsListenerResponse_32_message__sfield__Body__0
	"Body"
		type =
	qml_wsdl_import__seq__SOAP_32_Body_32_for_32_shutdownJmsListenerResponse__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_shutdownJmsListenerResponse__0
"SOAP Header for shutdownJmsListenerResponse"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_shutdownJmsListenerResponse__0
"SOAP Body for shutdownJmsListenerResponse"
{
	creator.structuredfield
	qml_wsdl_import__shutdownJmsListenerResponse_32_body__sfield__shutdownJmsListenerResponse__0
	"shutdownJmsListenerResponse"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__shutdownJmsListenerResponse__0;
}
creator.sequencetype qml_wsdl_import__seq__shutdownJmsListenerResponse__0
"shutdownJmsListenerResponse"
	namespace = "http://service.parabank.parasoft.com/"
{
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_getCustomer__0
"SOAP Envelope for getCustomer"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__in__0 ]
{
	creator.structuredfield
	qml_wsdl_import__getCustomer_32_message__sfield__Header__0 "Header"
		type = qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getCustomer__0
		optional;
	creator.structuredfield
	qml_wsdl_import__getCustomer_32_message__sfield__Body__0 "Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getCustomer__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getCustomer__0
"SOAP Header for getCustomer"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getCustomer__0
"SOAP Body for getCustomer"
{
	creator.structuredfield
	qml_wsdl_import__getCustomer_32_body__sfield__getCustomer__0 "getCustomer"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__getCustomer__0;
}
creator.sequencetype qml_wsdl_import__seq__getCustomer__0 "getCustomer"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.primitivefield qml_wsdl_import__getCustomer__pfield__customerId__0
	"customerId"
		namespace = "http://service.parabank.parasoft.com/"
		type = number;
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_getCustomerResponse__0
"SOAP Envelope for getCustomerResponse"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__out__0 ]
{
	creator.structuredfield
	qml_wsdl_import__getCustomerResponse_32_message__sfield__Header__0 "Header"
		type = qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getCustomerResponse__0
		optional;
	creator.structuredfield
	qml_wsdl_import__getCustomerResponse_32_message__sfield__Body__0 "Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getCustomerResponse__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getCustomerResponse__0
"SOAP Header for getCustomerResponse"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getCustomerResponse__0
"SOAP Body for getCustomerResponse"
{
	creator.structuredfield
	qml_wsdl_import__getCustomerResponse_32_body__sfield__getCustomerResponse__0
	"getCustomerResponse"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__getCustomerResponse__0;
}
creator.sequencetype qml_wsdl_import__seq__getCustomerResponse__0
"getCustomerResponse"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.structuredfield
	qml_wsdl_import__getCustomerResponse__sfield__customer__0 "customer"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__customer__0;
}
creator.sequencetype qml_wsdl_import__seq__customer__0 "customer"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.primitivefield qml_wsdl_import__customer__pfield__id__0 "id"
		type = number;
	creator.primitivefield qml_wsdl_import__customer__pfield__firstName__0
	"firstName"
		annotations = [ "xsd:minOccurs" = "0";
	]
		type = String
		optional;
	creator.primitivefield qml_wsdl_import__customer__pfield__lastName__0
	"lastName"
		annotations = [ "xsd:minOccurs" = "0";
	]
		type = String
		optional;
	creator.structuredfield qml_wsdl_import__customer__sfield__address__0
	"address"
		annotations = [ "xsd:minOccurs" = "0";
	]
		type = qml_wsdl_import__seq__address__0
		optional;
	creator.primitivefield qml_wsdl_import__customer__pfield__phoneNumber__0
	"phoneNumber"
		annotations = [ "xsd:minOccurs" = "0";
	]
		type = String
		optional;
	creator.primitivefield qml_wsdl_import__customer__pfield__ssn__0 "ssn"
		annotations = [ "xsd:minOccurs" = "0";
	]
		type = String
		optional;
}
creator.sequencetype qml_wsdl_import__seq__address__0 "address"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.primitivefield qml_wsdl_import__address__pfield__street__0 "street"
		annotations = [ "xsd:minOccurs" = "0";
	]
		type = String
		optional;
	creator.primitivefield qml_wsdl_import__address__pfield__city__0 "city"
		annotations = [ "xsd:minOccurs" = "0";
	]
		type = String
		optional;
	creator.primitivefield qml_wsdl_import__address__pfield__state__0 "state"
		annotations = [ "xsd:minOccurs" = "0";
	]
		type = String
		optional;
	creator.primitivefield qml_wsdl_import__address__pfield__zipCode__0 "zipCode"
		annotations = [ "xsd:minOccurs" = "0";
	]
		type = String
		optional;
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_updateCustomer__0
"SOAP Envelope for updateCustomer"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__in__0 ]
{
	creator.structuredfield
	qml_wsdl_import__updateCustomer_32_message__sfield__Header__0 "Header"
		type = qml_wsdl_import__seq__SOAP_32_Header_32_for_32_updateCustomer__0
		optional;
	creator.structuredfield
	qml_wsdl_import__updateCustomer_32_message__sfield__Body__0 "Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_updateCustomer__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_updateCustomer__0
"SOAP Header for updateCustomer"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_updateCustomer__0
"SOAP Body for updateCustomer"
{
	creator.structuredfield
	qml_wsdl_import__updateCustomer_32_body__sfield__updateCustomer__0
	"updateCustomer"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__updateCustomer__0;
}
creator.sequencetype qml_wsdl_import__seq__updateCustomer__0 "updateCustomer"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.primitivefield qml_wsdl_import__updateCustomer__pfield__customerId__0
	"customerId"
		namespace = "http://service.parabank.parasoft.com/"
		type = number;
	creator.primitivefield qml_wsdl_import__updateCustomer__pfield__firstName__0
	"firstName"
		namespace = "http://service.parabank.parasoft.com/"
		type = String;
	creator.primitivefield qml_wsdl_import__updateCustomer__pfield__lastName__0
	"lastName"
		namespace = "http://service.parabank.parasoft.com/"
		type = String;
	creator.primitivefield qml_wsdl_import__updateCustomer__pfield__street__0
	"street"
		namespace = "http://service.parabank.parasoft.com/"
		type = String;
	creator.primitivefield qml_wsdl_import__updateCustomer__pfield__city__0
	"city"
		namespace = "http://service.parabank.parasoft.com/"
		type = String;
	creator.primitivefield qml_wsdl_import__updateCustomer__pfield__state__0
	"state"
		namespace = "http://service.parabank.parasoft.com/"
		type = String;
	creator.primitivefield qml_wsdl_import__updateCustomer__pfield__zipCode__0
	"zipCode"
		namespace = "http://service.parabank.parasoft.com/"
		type = String;
	creator.primitivefield
	qml_wsdl_import__updateCustomer__pfield__phoneNumber__0 "phoneNumber"
		namespace = "http://service.parabank.parasoft.com/"
		type = String;
	creator.primitivefield qml_wsdl_import__updateCustomer__pfield__ssn__0 "ssn"
		namespace = "http://service.parabank.parasoft.com/"
		type = String;
	creator.primitivefield qml_wsdl_import__updateCustomer__pfield__username__0
	"username"
		namespace = "http://service.parabank.parasoft.com/"
		type = String;
	creator.primitivefield qml_wsdl_import__updateCustomer__pfield__password__0
	"password"
		namespace = "http://service.parabank.parasoft.com/"
		type = String;
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_updateCustomerResponse__0
"SOAP Envelope for updateCustomerResponse"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__out__0 ]
{
	creator.structuredfield
	qml_wsdl_import__updateCustomerResponse_32_message__sfield__Header__0
	"Header"
		type =
	qml_wsdl_import__seq__SOAP_32_Header_32_for_32_updateCustomerResponse__0
		optional;
	creator.structuredfield
	qml_wsdl_import__updateCustomerResponse_32_message__sfield__Body__0 "Body"
		type =
	qml_wsdl_import__seq__SOAP_32_Body_32_for_32_updateCustomerResponse__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_updateCustomerResponse__0
"SOAP Header for updateCustomerResponse"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_updateCustomerResponse__0
"SOAP Body for updateCustomerResponse"
{
	creator.structuredfield
	qml_wsdl_import__updateCustomerResponse_32_body__sfield__updateCustomerResponse__0
	"updateCustomerResponse"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__updateCustomerResponse__0;
}
creator.sequencetype qml_wsdl_import__seq__updateCustomerResponse__0
"updateCustomerResponse"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.primitivefield
	qml_wsdl_import__updateCustomerResponse__pfield__customerUpdateResult__0
	"customerUpdateResult"
		namespace = "http://service.parabank.parasoft.com/"
		type = String;
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_getPosition__0
"SOAP Envelope for getPosition"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__in__0 ]
{
	creator.structuredfield
	qml_wsdl_import__getPosition_32_message__sfield__Header__0 "Header"
		type = qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getPosition__0
		optional;
	creator.structuredfield
	qml_wsdl_import__getPosition_32_message__sfield__Body__0 "Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getPosition__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getPosition__0
"SOAP Header for getPosition"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getPosition__0
"SOAP Body for getPosition"
{
	creator.structuredfield
	qml_wsdl_import__getPosition_32_body__sfield__getPosition__0 "getPosition"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__getPosition__0;
}
creator.sequencetype qml_wsdl_import__seq__getPosition__0 "getPosition"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.primitivefield qml_wsdl_import__getPosition__pfield__positionId__0
	"positionId"
		namespace = "http://service.parabank.parasoft.com/"
		type = number;
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_getPositionResponse__0
"SOAP Envelope for getPositionResponse"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__out__0 ]
{
	creator.structuredfield
	qml_wsdl_import__getPositionResponse_32_message__sfield__Header__0 "Header"
		type = qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getPositionResponse__0
		optional;
	creator.structuredfield
	qml_wsdl_import__getPositionResponse_32_message__sfield__Body__0 "Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getPositionResponse__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getPositionResponse__0
"SOAP Header for getPositionResponse"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getPositionResponse__0
"SOAP Body for getPositionResponse"
{
	creator.structuredfield
	qml_wsdl_import__getPositionResponse_32_body__sfield__getPositionResponse__0
	"getPositionResponse"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__getPositionResponse__0;
}
creator.sequencetype qml_wsdl_import__seq__getPositionResponse__0
"getPositionResponse"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.structuredfield
	qml_wsdl_import__getPositionResponse__sfield__position__0 "position"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__position__0;
}
creator.sequencetype qml_wsdl_import__seq__position__0 "position"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.primitivefield qml_wsdl_import__position__pfield__positionId__0
	"positionId"
		type = number;
	creator.primitivefield qml_wsdl_import__position__pfield__customerId__0
	"customerId"
		type = number;
	creator.primitivefield qml_wsdl_import__position__pfield__name__0 "name"
		annotations = [ "xsd:minOccurs" = "0";
	]
		type = String
		optional;
	creator.primitivefield qml_wsdl_import__position__pfield__symbol__0 "symbol"
		annotations = [ "xsd:minOccurs" = "0";
	]
		type = String
		optional;
	creator.primitivefield qml_wsdl_import__position__pfield__shares__0 "shares"
		type = number;
	creator.primitivefield qml_wsdl_import__position__pfield__purchasePrice__0
	"purchasePrice"
		annotations = [ "xsd:minOccurs" = "0";
	]
		type = String
		optional;
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_sellPosition__0
"SOAP Envelope for sellPosition"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__in__0 ]
{
	creator.structuredfield
	qml_wsdl_import__sellPosition_32_message__sfield__Header__0 "Header"
		type = qml_wsdl_import__seq__SOAP_32_Header_32_for_32_sellPosition__0
		optional;
	creator.structuredfield
	qml_wsdl_import__sellPosition_32_message__sfield__Body__0 "Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_sellPosition__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_sellPosition__0
"SOAP Header for sellPosition"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_sellPosition__0
"SOAP Body for sellPosition"
{
	creator.structuredfield
	qml_wsdl_import__sellPosition_32_body__sfield__sellPosition__0 "sellPosition"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__sellPosition__0;
}
creator.sequencetype qml_wsdl_import__seq__sellPosition__0 "sellPosition"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.primitivefield qml_wsdl_import__sellPosition__pfield__customerId__0
	"customerId"
		namespace = "http://service.parabank.parasoft.com/"
		type = number;
	creator.primitivefield qml_wsdl_import__sellPosition__pfield__accountId__0
	"accountId"
		namespace = "http://service.parabank.parasoft.com/"
		type = number;
	creator.primitivefield qml_wsdl_import__sellPosition__pfield__positionId__0
	"positionId"
		namespace = "http://service.parabank.parasoft.com/"
		type = number;
	creator.primitivefield qml_wsdl_import__sellPosition__pfield__shares__0
	"shares"
		namespace = "http://service.parabank.parasoft.com/"
		type = number;
	creator.primitivefield
	qml_wsdl_import__sellPosition__pfield__pricePerShare__0 "pricePerShare"
		namespace = "http://service.parabank.parasoft.com/"
		type = String;
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_sellPositionResponse__0
"SOAP Envelope for sellPositionResponse"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__out__0 ]
{
	creator.structuredfield
	qml_wsdl_import__sellPositionResponse_32_message__sfield__Header__0 "Header"
		type =
	qml_wsdl_import__seq__SOAP_32_Header_32_for_32_sellPositionResponse__0
		optional;
	creator.structuredfield
	qml_wsdl_import__sellPositionResponse_32_message__sfield__Body__0 "Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_sellPositionResponse__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_sellPositionResponse__0
"SOAP Header for sellPositionResponse"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_sellPositionResponse__0
"SOAP Body for sellPositionResponse"
{
	creator.structuredfield
	qml_wsdl_import__sellPositionResponse_32_body__sfield__sellPositionResponse__0
	"sellPositionResponse"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__sellPositionResponse__0;
}
creator.sequencetype qml_wsdl_import__seq__sellPositionResponse__0
"sellPositionResponse"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.structuredfield
	qml_wsdl_import__sellPositionResponse__sfield__position__0 "position"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__position__0 array;
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_createAccount__0
"SOAP Envelope for createAccount"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__in__0 ]
{
	creator.structuredfield
	qml_wsdl_import__createAccount_32_message__sfield__Header__0 "Header"
		type = qml_wsdl_import__seq__SOAP_32_Header_32_for_32_createAccount__0
		optional;
	creator.structuredfield
	qml_wsdl_import__createAccount_32_message__sfield__Body__0 "Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_createAccount__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_createAccount__0
"SOAP Header for createAccount"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_createAccount__0
"SOAP Body for createAccount"
{
	creator.structuredfield
	qml_wsdl_import__createAccount_32_body__sfield__createAccount__0
	"createAccount"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__createAccount__0;
}
creator.sequencetype qml_wsdl_import__seq__createAccount__0 "createAccount"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.primitivefield qml_wsdl_import__createAccount__pfield__customerId__0
	"customerId"
		namespace = "http://service.parabank.parasoft.com/"
		type = number;
	creator.primitivefield
	qml_wsdl_import__createAccount__pfield__newAccountType__0 "newAccountType"
		namespace = "http://service.parabank.parasoft.com/"
		type = number;
	creator.primitivefield
	qml_wsdl_import__createAccount__pfield__fromAccountId__0 "fromAccountId"
		namespace = "http://service.parabank.parasoft.com/"
		type = number;
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_createAccountResponse__0
"SOAP Envelope for createAccountResponse"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__out__0 ]
{
	creator.structuredfield
	qml_wsdl_import__createAccountResponse_32_message__sfield__Header__0 "Header"
		type =
	qml_wsdl_import__seq__SOAP_32_Header_32_for_32_createAccountResponse__0
		optional;
	creator.structuredfield
	qml_wsdl_import__createAccountResponse_32_message__sfield__Body__0 "Body"
		type =
	qml_wsdl_import__seq__SOAP_32_Body_32_for_32_createAccountResponse__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_createAccountResponse__0
"SOAP Header for createAccountResponse"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_createAccountResponse__0
"SOAP Body for createAccountResponse"
{
	creator.structuredfield
	qml_wsdl_import__createAccountResponse_32_body__sfield__createAccountResponse__0
	"createAccountResponse"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__createAccountResponse__0;
}
creator.sequencetype qml_wsdl_import__seq__createAccountResponse__0
"createAccountResponse"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.structuredfield
	qml_wsdl_import__createAccountResponse__sfield__account__0 "account"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__account__0;
}
creator.sequencetype qml_wsdl_import__seq__account__0 "account"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.primitivefield qml_wsdl_import__account__pfield__id__0 "id"
		type = number;
	creator.primitivefield qml_wsdl_import__account__pfield__customerId__0
	"customerId"
		type = number;
	creator.enumerationfield qml_wsdl_import__account__enumfield__type__0 "type"
		annotations = [ "xsd:minOccurs" = "0";
	]
		type = qml_wsdl_import__enum__accountType__0
		optional;
	creator.primitivefield qml_wsdl_import__account__pfield__balance__0 "balance"
		annotations = [ "xsd:minOccurs" = "0";
	]
		type = String
		optional;
}
creator.enum qml_wsdl_import__enum__accountType__0 "accountType"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.enumerationvalue qml_wsdl_import__accountType__enumval__CHECKING__0
	"CHECKING";
	creator.enumerationvalue qml_wsdl_import__accountType__enumval__SAVINGS__0
	"SAVINGS";
	creator.enumerationvalue qml_wsdl_import__accountType__enumval__LOAN__0
	"LOAN";
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_startupJmsListener__0
"SOAP Envelope for startupJmsListener"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__in__0 ]
{
	creator.structuredfield
	qml_wsdl_import__startupJmsListener_32_message__sfield__Header__0 "Header"
		type = qml_wsdl_import__seq__SOAP_32_Header_32_for_32_startupJmsListener__0
		optional;
	creator.structuredfield
	qml_wsdl_import__startupJmsListener_32_message__sfield__Body__0 "Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_startupJmsListener__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_startupJmsListener__0
"SOAP Header for startupJmsListener"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_startupJmsListener__0
"SOAP Body for startupJmsListener"
{
	creator.structuredfield
	qml_wsdl_import__startupJmsListener_32_body__sfield__startupJmsListener__0
	"startupJmsListener"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__startupJmsListener__0;
}
creator.sequencetype qml_wsdl_import__seq__startupJmsListener__0
"startupJmsListener"
	namespace = "http://service.parabank.parasoft.com/"
{
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_startupJmsListenerResponse__0
"SOAP Envelope for startupJmsListenerResponse"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__out__0 ]
{
	creator.structuredfield
	qml_wsdl_import__startupJmsListenerResponse_32_message__sfield__Header__0
	"Header"
		type =
	qml_wsdl_import__seq__SOAP_32_Header_32_for_32_startupJmsListenerResponse__0
		optional;
	creator.structuredfield
	qml_wsdl_import__startupJmsListenerResponse_32_message__sfield__Body__0
	"Body"
		type =
	qml_wsdl_import__seq__SOAP_32_Body_32_for_32_startupJmsListenerResponse__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_startupJmsListenerResponse__0
"SOAP Header for startupJmsListenerResponse"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_startupJmsListenerResponse__0
"SOAP Body for startupJmsListenerResponse"
{
	creator.structuredfield
	qml_wsdl_import__startupJmsListenerResponse_32_body__sfield__startupJmsListenerResponse__0
	"startupJmsListenerResponse"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__startupJmsListenerResponse__0;
}
creator.sequencetype qml_wsdl_import__seq__startupJmsListenerResponse__0
"startupJmsListenerResponse"
	namespace = "http://service.parabank.parasoft.com/"
{
}
creator.message qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_login__0
"SOAP Envelope for login"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__in__0 ]
{
	creator.structuredfield qml_wsdl_import__login_32_message__sfield__Header__0
	"Header"
		type = qml_wsdl_import__seq__SOAP_32_Header_32_for_32_login__0
		optional;
	creator.structuredfield qml_wsdl_import__login_32_message__sfield__Body__0
	"Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_login__0;
}
creator.sequencetype qml_wsdl_import__seq__SOAP_32_Header_32_for_32_login__0
"SOAP Header for login"
{
}
creator.sequencetype qml_wsdl_import__seq__SOAP_32_Body_32_for_32_login__0
"SOAP Body for login"
{
	creator.structuredfield qml_wsdl_import__login_32_body__sfield__login__0
	"login"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__login__0;
}
creator.sequencetype qml_wsdl_import__seq__login__0 "login"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.primitivefield qml_wsdl_import__login__pfield__username__0 "username"
		namespace = "http://service.parabank.parasoft.com/"
		type = String;
	creator.primitivefield qml_wsdl_import__login__pfield__password__0 "password"
		namespace = "http://service.parabank.parasoft.com/"
		type = String;
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_loginResponse__0
"SOAP Envelope for loginResponse"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__out__0 ]
{
	creator.structuredfield
	qml_wsdl_import__loginResponse_32_message__sfield__Header__0 "Header"
		type = qml_wsdl_import__seq__SOAP_32_Header_32_for_32_loginResponse__0
		optional;
	creator.structuredfield
	qml_wsdl_import__loginResponse_32_message__sfield__Body__0 "Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_loginResponse__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_loginResponse__0
"SOAP Header for loginResponse"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_loginResponse__0
"SOAP Body for loginResponse"
{
	creator.structuredfield
	qml_wsdl_import__loginResponse_32_body__sfield__loginResponse__0
	"loginResponse"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__loginResponse__0;
}
creator.sequencetype qml_wsdl_import__seq__loginResponse__0 "loginResponse"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.structuredfield qml_wsdl_import__loginResponse__sfield__customerId__0
	"customerId"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__customer__0;
}
creator.message qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_deposit__0
"SOAP Envelope for deposit"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__in__0 ]
{
	creator.structuredfield
	qml_wsdl_import__deposit_32_message__sfield__Header__0 "Header"
		type = qml_wsdl_import__seq__SOAP_32_Header_32_for_32_deposit__0
		optional;
	creator.structuredfield qml_wsdl_import__deposit_32_message__sfield__Body__0
	"Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_deposit__0;
}
creator.sequencetype qml_wsdl_import__seq__SOAP_32_Header_32_for_32_deposit__0
"SOAP Header for deposit"
{
}
creator.sequencetype qml_wsdl_import__seq__SOAP_32_Body_32_for_32_deposit__0
"SOAP Body for deposit"
{
	creator.structuredfield qml_wsdl_import__deposit_32_body__sfield__deposit__0
	"deposit"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__deposit__0;
}
creator.sequencetype qml_wsdl_import__seq__deposit__0 "deposit"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.primitivefield qml_wsdl_import__deposit__pfield__accountId__0
	"accountId"
		namespace = "http://service.parabank.parasoft.com/"
		type = number;
	creator.primitivefield qml_wsdl_import__deposit__pfield__amount__0 "amount"
		namespace = "http://service.parabank.parasoft.com/"
		type = String;
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_depositResponse__0
"SOAP Envelope for depositResponse"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__out__0 ]
{
	creator.structuredfield
	qml_wsdl_import__depositResponse_32_message__sfield__Header__0 "Header"
		type = qml_wsdl_import__seq__SOAP_32_Header_32_for_32_depositResponse__0
		optional;
	creator.structuredfield
	qml_wsdl_import__depositResponse_32_message__sfield__Body__0 "Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_depositResponse__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_depositResponse__0
"SOAP Header for depositResponse"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_depositResponse__0
"SOAP Body for depositResponse"
{
	creator.structuredfield
	qml_wsdl_import__depositResponse_32_body__sfield__depositResponse__0
	"depositResponse"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__depositResponse__0;
}
creator.sequencetype qml_wsdl_import__seq__depositResponse__0
"depositResponse"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.primitivefield
	qml_wsdl_import__depositResponse__pfield__depositReturn__0 "depositReturn"
		namespace = "http://service.parabank.parasoft.com/"
		type = String;
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_getTransactionsByAmount__0
"SOAP Envelope for getTransactionsByAmount"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__in__0 ]
{
	creator.structuredfield
	qml_wsdl_import__getTransactionsByAmount_32_message__sfield__Header__0
	"Header"
		type =
	qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getTransactionsByAmount__0
		optional;
	creator.structuredfield
	qml_wsdl_import__getTransactionsByAmount_32_message__sfield__Body__0 "Body"
		type =
	qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getTransactionsByAmount__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getTransactionsByAmount__0
"SOAP Header for getTransactionsByAmount"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getTransactionsByAmount__0
"SOAP Body for getTransactionsByAmount"
{
	creator.structuredfield
	qml_wsdl_import__getTransactionsByAmount_32_body__sfield__getTransactionsByAmount__0
	"getTransactionsByAmount"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__getTransactionsByAmount__0;
}
creator.sequencetype qml_wsdl_import__seq__getTransactionsByAmount__0
"getTransactionsByAmount"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.primitivefield
	qml_wsdl_import__getTransactionsByAmount__pfield__accountId__0 "accountId"
		namespace = "http://service.parabank.parasoft.com/"
		type = number;
	creator.primitivefield
	qml_wsdl_import__getTransactionsByAmount__pfield__amount__0 "amount"
		namespace = "http://service.parabank.parasoft.com/"
		type = String;
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_getTransactionsByAmountResponse__0
"SOAP Envelope for getTransactionsByAmountResponse"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__out__0 ]
{
	creator.structuredfield
	qml_wsdl_import__getTransactionsByAmountResponse_32_message__sfield__Header__0
	"Header"
		type =
	qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getTransactionsByAmountResponse__0
		optional;
	creator.structuredfield
	qml_wsdl_import__getTransactionsByAmountResponse_32_message__sfield__Body__0
	"Body"
		type =
	qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getTransactionsByAmountResponse__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getTransactionsByAmountResponse__0
"SOAP Header for getTransactionsByAmountResponse"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getTransactionsByAmountResponse__0
"SOAP Body for getTransactionsByAmountResponse"
{
	creator.structuredfield
	qml_wsdl_import__getTransactionsByAmountResponse_32_body__sfield__getTransactionsByAmountResponse__0
	"getTransactionsByAmountResponse"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__getTransactionsByAmountResponse__0;
}
creator.sequencetype qml_wsdl_import__seq__getTransactionsByAmountResponse__0
"getTransactionsByAmountResponse"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.structuredfield
	qml_wsdl_import__getTransactionsByAmountResponse__sfield__transaction__0
	"transaction"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__transaction__0 array;
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_setParameter__0
"SOAP Envelope for setParameter"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__in__0 ]
{
	creator.structuredfield
	qml_wsdl_import__setParameter_32_message__sfield__Header__0 "Header"
		type = qml_wsdl_import__seq__SOAP_32_Header_32_for_32_setParameter__0
		optional;
	creator.structuredfield
	qml_wsdl_import__setParameter_32_message__sfield__Body__0 "Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_setParameter__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_setParameter__0
"SOAP Header for setParameter"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_setParameter__0
"SOAP Body for setParameter"
{
	creator.structuredfield
	qml_wsdl_import__setParameter_32_body__sfield__setParameter__0 "setParameter"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__setParameter__0;
}
creator.sequencetype qml_wsdl_import__seq__setParameter__0 "setParameter"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.primitivefield qml_wsdl_import__setParameter__pfield__name__0 "name"
		namespace = "http://service.parabank.parasoft.com/"
		type = String;
	creator.primitivefield qml_wsdl_import__setParameter__pfield__value__0
	"value"
		namespace = "http://service.parabank.parasoft.com/"
		type = String;
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_setParameterResponse__0
"SOAP Envelope for setParameterResponse"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__out__0 ]
{
	creator.structuredfield
	qml_wsdl_import__setParameterResponse_32_message__sfield__Header__0 "Header"
		type =
	qml_wsdl_import__seq__SOAP_32_Header_32_for_32_setParameterResponse__0
		optional;
	creator.structuredfield
	qml_wsdl_import__setParameterResponse_32_message__sfield__Body__0 "Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_setParameterResponse__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_setParameterResponse__0
"SOAP Header for setParameterResponse"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_setParameterResponse__0
"SOAP Body for setParameterResponse"
{
	creator.structuredfield
	qml_wsdl_import__setParameterResponse_32_body__sfield__setParameterResponse__0
	"setParameterResponse"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__setParameterResponse__0;
}
creator.sequencetype qml_wsdl_import__seq__setParameterResponse__0
"setParameterResponse"
	namespace = "http://service.parabank.parasoft.com/"
{
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_getPositions__0
"SOAP Envelope for getPositions"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__in__0 ]
{
	creator.structuredfield
	qml_wsdl_import__getPositions_32_message__sfield__Header__0 "Header"
		type = qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getPositions__0
		optional;
	creator.structuredfield
	qml_wsdl_import__getPositions_32_message__sfield__Body__0 "Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getPositions__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getPositions__0
"SOAP Header for getPositions"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getPositions__0
"SOAP Body for getPositions"
{
	creator.structuredfield
	qml_wsdl_import__getPositions_32_body__sfield__getPositions__0 "getPositions"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__getPositions__0;
}
creator.sequencetype qml_wsdl_import__seq__getPositions__0 "getPositions"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.primitivefield qml_wsdl_import__getPositions__pfield__customerId__0
	"customerId"
		namespace = "http://service.parabank.parasoft.com/"
		type = number;
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_getPositionsResponse__0
"SOAP Envelope for getPositionsResponse"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__out__0 ]
{
	creator.structuredfield
	qml_wsdl_import__getPositionsResponse_32_message__sfield__Header__0 "Header"
		type =
	qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getPositionsResponse__0
		optional;
	creator.structuredfield
	qml_wsdl_import__getPositionsResponse_32_message__sfield__Body__0 "Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getPositionsResponse__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getPositionsResponse__0
"SOAP Header for getPositionsResponse"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getPositionsResponse__0
"SOAP Body for getPositionsResponse"
{
	creator.structuredfield
	qml_wsdl_import__getPositionsResponse_32_body__sfield__getPositionsResponse__0
	"getPositionsResponse"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__getPositionsResponse__0;
}
creator.sequencetype qml_wsdl_import__seq__getPositionsResponse__0
"getPositionsResponse"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.structuredfield
	qml_wsdl_import__getPositionsResponse__sfield__position__0 "position"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__position__0 array;
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_getTransactionsByMonthAndType__0
"SOAP Envelope for getTransactionsByMonthAndType"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__in__0 ]
{
	creator.structuredfield
	qml_wsdl_import__getTransactionsByMonthAndType_32_message__sfield__Header__0
	"Header"
		type =
	qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getTransactionsByMonthAndType__0
		optional;
	creator.structuredfield
	qml_wsdl_import__getTransactionsByMonthAndType_32_message__sfield__Body__0
	"Body"
		type =
	qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getTransactionsByMonthAndType__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getTransactionsByMonthAndType__0
"SOAP Header for getTransactionsByMonthAndType"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getTransactionsByMonthAndType__0
"SOAP Body for getTransactionsByMonthAndType"
{
	creator.structuredfield
	qml_wsdl_import__getTransactionsByMonthAndType_32_body__sfield__getTransactionsByMonthAndType__0
	"getTransactionsByMonthAndType"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__getTransactionsByMonthAndType__0;
}
creator.sequencetype qml_wsdl_import__seq__getTransactionsByMonthAndType__0
"getTransactionsByMonthAndType"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.primitivefield
	qml_wsdl_import__getTransactionsByMonthAndType__pfield__accountId__0
	"accountId"
		namespace = "http://service.parabank.parasoft.com/"
		type = number;
	creator.primitivefield
	qml_wsdl_import__getTransactionsByMonthAndType__pfield__month__0 "month"
		namespace = "http://service.parabank.parasoft.com/"
		type = String;
	creator.primitivefield
	qml_wsdl_import__getTransactionsByMonthAndType__pfield__type__0 "type"
		namespace = "http://service.parabank.parasoft.com/"
		type = String;
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_getTransactionsByMonthAndTypeResponse__0
"SOAP Envelope for getTransactionsByMonthAndTypeResponse"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__out__0 ]
{
	creator.structuredfield
	qml_wsdl_import__getTransactionsByMonthAndTypeResponse_32_message__sfield__Header__0
	"Header"
		type =
	qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getTransactionsByMonthAndTypeResponse__0
		optional;
	creator.structuredfield
	qml_wsdl_import__getTransactionsByMonthAndTypeResponse_32_message__sfield__Body__0
	"Body"
		type =
	qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getTransactionsByMonthAndTypeResponse__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getTransactionsByMonthAndTypeResponse__0
"SOAP Header for getTransactionsByMonthAndTypeResponse"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getTransactionsByMonthAndTypeResponse__0
"SOAP Body for getTransactionsByMonthAndTypeResponse"
{
	creator.structuredfield
	qml_wsdl_import__getTransactionsByMonthAndTypeResponse_32_body__sfield__getTransactionsByMonthAndTypeResponse__0
	"getTransactionsByMonthAndTypeResponse"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__getTransactionsByMonthAndTypeResponse__0;
}
creator.sequencetype
qml_wsdl_import__seq__getTransactionsByMonthAndTypeResponse__0
"getTransactionsByMonthAndTypeResponse"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.structuredfield
	qml_wsdl_import__getTransactionsByMonthAndTypeResponse__sfield__transaction__0
	"transaction"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__transaction__0 array;
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_getTransactions__0
"SOAP Envelope for getTransactions"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__in__0 ]
{
	creator.structuredfield
	qml_wsdl_import__getTransactions_32_message__sfield__Header__0 "Header"
		type = qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getTransactions__0
		optional;
	creator.structuredfield
	qml_wsdl_import__getTransactions_32_message__sfield__Body__0 "Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getTransactions__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getTransactions__0
"SOAP Header for getTransactions"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getTransactions__0
"SOAP Body for getTransactions"
{
	creator.structuredfield
	qml_wsdl_import__getTransactions_32_body__sfield__getTransactions__0
	"getTransactions"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__getTransactions__0;
}
creator.sequencetype qml_wsdl_import__seq__getTransactions__0
"getTransactions"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.primitivefield qml_wsdl_import__getTransactions__pfield__accountId__0
	"accountId"
		namespace = "http://service.parabank.parasoft.com/"
		type = number;
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_getTransactionsResponse__0
"SOAP Envelope for getTransactionsResponse"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__out__0 ]
{
	creator.structuredfield
	qml_wsdl_import__getTransactionsResponse_32_message__sfield__Header__0
	"Header"
		type =
	qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getTransactionsResponse__0
		optional;
	creator.structuredfield
	qml_wsdl_import__getTransactionsResponse_32_message__sfield__Body__0 "Body"
		type =
	qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getTransactionsResponse__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getTransactionsResponse__0
"SOAP Header for getTransactionsResponse"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getTransactionsResponse__0
"SOAP Body for getTransactionsResponse"
{
	creator.structuredfield
	qml_wsdl_import__getTransactionsResponse_32_body__sfield__getTransactionsResponse__0
	"getTransactionsResponse"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__getTransactionsResponse__0;
}
creator.sequencetype qml_wsdl_import__seq__getTransactionsResponse__0
"getTransactionsResponse"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.structuredfield
	qml_wsdl_import__getTransactionsResponse__sfield__transaction__0
	"transaction"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__transaction__0 array;
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_getTransactionsByToFromDate__0
"SOAP Envelope for getTransactionsByToFromDate"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__in__0 ]
{
	creator.structuredfield
	qml_wsdl_import__getTransactionsByToFromDate_32_message__sfield__Header__0
	"Header"
		type =
	qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getTransactionsByToFromDate__0
		optional;
	creator.structuredfield
	qml_wsdl_import__getTransactionsByToFromDate_32_message__sfield__Body__0
	"Body"
		type =
	qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getTransactionsByToFromDate__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getTransactionsByToFromDate__0
"SOAP Header for getTransactionsByToFromDate"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getTransactionsByToFromDate__0
"SOAP Body for getTransactionsByToFromDate"
{
	creator.structuredfield
	qml_wsdl_import__getTransactionsByToFromDate_32_body__sfield__getTransactionsByToFromDate__0
	"getTransactionsByToFromDate"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__getTransactionsByToFromDate__0;
}
creator.sequencetype qml_wsdl_import__seq__getTransactionsByToFromDate__0
"getTransactionsByToFromDate"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.primitivefield
	qml_wsdl_import__getTransactionsByToFromDate__pfield__accountId__0
	"accountId"
		namespace = "http://service.parabank.parasoft.com/"
		type = number;
	creator.primitivefield
	qml_wsdl_import__getTransactionsByToFromDate__pfield__fromDate__0 "fromDate"
		namespace = "http://service.parabank.parasoft.com/"
		type = String;
	creator.primitivefield
	qml_wsdl_import__getTransactionsByToFromDate__pfield__toDate__0 "toDate"
		namespace = "http://service.parabank.parasoft.com/"
		type = String;
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_getTransactionsByToFromDateResponse__0
"SOAP Envelope for getTransactionsByToFromDateResponse"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__out__0 ]
{
	creator.structuredfield
	qml_wsdl_import__getTransactionsByToFromDateResponse_32_message__sfield__Header__0
	"Header"
		type =
	qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getTransactionsByToFromDateResponse__0
		optional;
	creator.structuredfield
	qml_wsdl_import__getTransactionsByToFromDateResponse_32_message__sfield__Body__0
	"Body"
		type =
	qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getTransactionsByToFromDateResponse__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getTransactionsByToFromDateResponse__0
"SOAP Header for getTransactionsByToFromDateResponse"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getTransactionsByToFromDateResponse__0
"SOAP Body for getTransactionsByToFromDateResponse"
{
	creator.structuredfield
	qml_wsdl_import__getTransactionsByToFromDateResponse_32_body__sfield__getTransactionsByToFromDateResponse__0
	"getTransactionsByToFromDateResponse"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__getTransactionsByToFromDateResponse__0;
}
creator.sequencetype
qml_wsdl_import__seq__getTransactionsByToFromDateResponse__0
"getTransactionsByToFromDateResponse"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.structuredfield
	qml_wsdl_import__getTransactionsByToFromDateResponse__sfield__transaction__0
	"transaction"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__transaction__0 array;
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_requestLoan__0
"SOAP Envelope for requestLoan"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__in__0 ]
{
	creator.structuredfield
	qml_wsdl_import__requestLoan_32_message__sfield__Header__0 "Header"
		type = qml_wsdl_import__seq__SOAP_32_Header_32_for_32_requestLoan__0
		optional;
	creator.structuredfield
	qml_wsdl_import__requestLoan_32_message__sfield__Body__0 "Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_requestLoan__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_requestLoan__0
"SOAP Header for requestLoan"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_requestLoan__0
"SOAP Body for requestLoan"
{
	creator.structuredfield
	qml_wsdl_import__requestLoan_32_body__sfield__requestLoan__0 "requestLoan"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__requestLoan__0;
}
creator.sequencetype qml_wsdl_import__seq__requestLoan__0 "requestLoan"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.primitivefield qml_wsdl_import__requestLoan__pfield__customerId__0
	"customerId"
		namespace = "http://service.parabank.parasoft.com/"
		type = number;
	creator.primitivefield qml_wsdl_import__requestLoan__pfield__amount__0
	"amount"
		namespace = "http://service.parabank.parasoft.com/"
		type = String;
	creator.primitivefield qml_wsdl_import__requestLoan__pfield__downPayment__0
	"downPayment"
		namespace = "http://service.parabank.parasoft.com/"
		type = String;
	creator.primitivefield qml_wsdl_import__requestLoan__pfield__fromAccountId__0
	"fromAccountId"
		namespace = "http://service.parabank.parasoft.com/"
		type = number;
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_requestLoanResponse__0
"SOAP Envelope for requestLoanResponse"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__out__0 ]
{
	creator.structuredfield
	qml_wsdl_import__requestLoanResponse_32_message__sfield__Header__0 "Header"
		type = qml_wsdl_import__seq__SOAP_32_Header_32_for_32_requestLoanResponse__0
		optional;
	creator.structuredfield
	qml_wsdl_import__requestLoanResponse_32_message__sfield__Body__0 "Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_requestLoanResponse__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_requestLoanResponse__0
"SOAP Header for requestLoanResponse"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_requestLoanResponse__0
"SOAP Body for requestLoanResponse"
{
	creator.structuredfield
	qml_wsdl_import__requestLoanResponse_32_body__sfield__requestLoanResponse__0
	"requestLoanResponse"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__requestLoanResponse__0;
}
creator.sequencetype qml_wsdl_import__seq__requestLoanResponse__0
"requestLoanResponse"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.structuredfield
	qml_wsdl_import__requestLoanResponse__sfield__loanResponse__0 "loanResponse"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__loanResponse__0;
}
creator.sequencetype qml_wsdl_import__seq__loanResponse__0 "loanResponse"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.primitivefield qml_wsdl_import__loanResponse__pfield__responseDate__0
	"responseDate"
		annotations = [ "xsd:minOccurs" = "0";
	]
		type = String
		optional;
	creator.primitivefield
	qml_wsdl_import__loanResponse__pfield__loanProviderName__0 "loanProviderName"
		type = String;
	creator.primitivefield qml_wsdl_import__loanResponse__pfield__approved__0
	"approved"
		type = boolean;
	creator.primitivefield qml_wsdl_import__loanResponse__pfield__message__0
	"message"
		annotations = [ "xsd:minOccurs" = "0";
	]
		type = String
		optional;
	creator.primitivefield qml_wsdl_import__loanResponse__pfield__accountId__0
	"accountId"
		annotations = [ "xsd:minOccurs" = "0";
	]
		type = number
		optional;
}
creator.message qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_withdraw__0
"SOAP Envelope for withdraw"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__in__0 ]
{
	creator.structuredfield
	qml_wsdl_import__withdraw_32_message__sfield__Header__0 "Header"
		type = qml_wsdl_import__seq__SOAP_32_Header_32_for_32_withdraw__0
		optional;
	creator.structuredfield qml_wsdl_import__withdraw_32_message__sfield__Body__0
	"Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_withdraw__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_withdraw__0
"SOAP Header for withdraw"
{
}
creator.sequencetype qml_wsdl_import__seq__SOAP_32_Body_32_for_32_withdraw__0
"SOAP Body for withdraw"
{
	creator.structuredfield
	qml_wsdl_import__withdraw_32_body__sfield__withdraw__0 "withdraw"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__withdraw__0;
}
creator.sequencetype qml_wsdl_import__seq__withdraw__0 "withdraw"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.primitivefield qml_wsdl_import__withdraw__pfield__accountId__0
	"accountId"
		namespace = "http://service.parabank.parasoft.com/"
		type = number;
	creator.primitivefield qml_wsdl_import__withdraw__pfield__amount__0 "amount"
		namespace = "http://service.parabank.parasoft.com/"
		type = String;
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_withdrawResponse__0
"SOAP Envelope for withdrawResponse"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__out__0 ]
{
	creator.structuredfield
	qml_wsdl_import__withdrawResponse_32_message__sfield__Header__0 "Header"
		type = qml_wsdl_import__seq__SOAP_32_Header_32_for_32_withdrawResponse__0
		optional;
	creator.structuredfield
	qml_wsdl_import__withdrawResponse_32_message__sfield__Body__0 "Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_withdrawResponse__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_withdrawResponse__0
"SOAP Header for withdrawResponse"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_withdrawResponse__0
"SOAP Body for withdrawResponse"
{
	creator.structuredfield
	qml_wsdl_import__withdrawResponse_32_body__sfield__withdrawResponse__0
	"withdrawResponse"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__withdrawResponse__0;
}
creator.sequencetype qml_wsdl_import__seq__withdrawResponse__0
"withdrawResponse"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.primitivefield
	qml_wsdl_import__withdrawResponse__pfield__withdrawReturn__0 "withdrawReturn"
		namespace = "http://service.parabank.parasoft.com/"
		type = String;
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_getAccounts__0
"SOAP Envelope for getAccounts"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__in__0 ]
{
	creator.structuredfield
	qml_wsdl_import__getAccounts_32_message__sfield__Header__0 "Header"
		type = qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getAccounts__0
		optional;
	creator.structuredfield
	qml_wsdl_import__getAccounts_32_message__sfield__Body__0 "Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getAccounts__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getAccounts__0
"SOAP Header for getAccounts"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getAccounts__0
"SOAP Body for getAccounts"
{
	creator.structuredfield
	qml_wsdl_import__getAccounts_32_body__sfield__getAccounts__0 "getAccounts"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__getAccounts__0;
}
creator.sequencetype qml_wsdl_import__seq__getAccounts__0 "getAccounts"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.primitivefield qml_wsdl_import__getAccounts__pfield__customerId__0
	"customerId"
		namespace = "http://service.parabank.parasoft.com/"
		type = number;
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_getAccountsResponse__0
"SOAP Envelope for getAccountsResponse"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__out__0 ]
{
	creator.structuredfield
	qml_wsdl_import__getAccountsResponse_32_message__sfield__Header__0 "Header"
		type = qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getAccountsResponse__0
		optional;
	creator.structuredfield
	qml_wsdl_import__getAccountsResponse_32_message__sfield__Body__0 "Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getAccountsResponse__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getAccountsResponse__0
"SOAP Header for getAccountsResponse"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getAccountsResponse__0
"SOAP Body for getAccountsResponse"
{
	creator.structuredfield
	qml_wsdl_import__getAccountsResponse_32_body__sfield__getAccountsResponse__0
	"getAccountsResponse"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__getAccountsResponse__0;
}
creator.sequencetype qml_wsdl_import__seq__getAccountsResponse__0
"getAccountsResponse"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.structuredfield
	qml_wsdl_import__getAccountsResponse__sfield__account__0 "account"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__account__0 array;
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_buyPosition__0
"SOAP Envelope for buyPosition"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__in__0 ]
{
	creator.structuredfield
	qml_wsdl_import__buyPosition_32_message__sfield__Header__0 "Header"
		type = qml_wsdl_import__seq__SOAP_32_Header_32_for_32_buyPosition__0
		optional;
	creator.structuredfield
	qml_wsdl_import__buyPosition_32_message__sfield__Body__0 "Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_buyPosition__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_buyPosition__0
"SOAP Header for buyPosition"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_buyPosition__0
"SOAP Body for buyPosition"
{
	creator.structuredfield
	qml_wsdl_import__buyPosition_32_body__sfield__buyPosition__0 "buyPosition"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__buyPosition__0;
}
creator.sequencetype qml_wsdl_import__seq__buyPosition__0 "buyPosition"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.primitivefield qml_wsdl_import__buyPosition__pfield__customerId__0
	"customerId"
		namespace = "http://service.parabank.parasoft.com/"
		type = number;
	creator.primitivefield qml_wsdl_import__buyPosition__pfield__accountId__0
	"accountId"
		namespace = "http://service.parabank.parasoft.com/"
		type = number;
	creator.primitivefield qml_wsdl_import__buyPosition__pfield__name__0 "name"
		namespace = "http://service.parabank.parasoft.com/"
		type = String;
	creator.primitivefield qml_wsdl_import__buyPosition__pfield__symbol__0
	"symbol"
		namespace = "http://service.parabank.parasoft.com/"
		type = String;
	creator.primitivefield qml_wsdl_import__buyPosition__pfield__shares__0
	"shares"
		namespace = "http://service.parabank.parasoft.com/"
		type = number;
	creator.primitivefield qml_wsdl_import__buyPosition__pfield__pricePerShare__0
	"pricePerShare"
		namespace = "http://service.parabank.parasoft.com/"
		type = String;
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_buyPositionResponse__0
"SOAP Envelope for buyPositionResponse"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__out__0 ]
{
	creator.structuredfield
	qml_wsdl_import__buyPositionResponse_32_message__sfield__Header__0 "Header"
		type = qml_wsdl_import__seq__SOAP_32_Header_32_for_32_buyPositionResponse__0
		optional;
	creator.structuredfield
	qml_wsdl_import__buyPositionResponse_32_message__sfield__Body__0 "Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_buyPositionResponse__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_buyPositionResponse__0
"SOAP Header for buyPositionResponse"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_buyPositionResponse__0
"SOAP Body for buyPositionResponse"
{
	creator.structuredfield
	qml_wsdl_import__buyPositionResponse_32_body__sfield__buyPositionResponse__0
	"buyPositionResponse"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__buyPositionResponse__0;
}
creator.sequencetype qml_wsdl_import__seq__buyPositionResponse__0
"buyPositionResponse"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.structuredfield
	qml_wsdl_import__buyPositionResponse__sfield__position__0 "position"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__position__0 array;
}
creator.message qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_cleanDB__0
"SOAP Envelope for cleanDB"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__in__0 ]
{
	creator.structuredfield
	qml_wsdl_import__cleanDB_32_message__sfield__Header__0 "Header"
		type = qml_wsdl_import__seq__SOAP_32_Header_32_for_32_cleanDB__0
		optional;
	creator.structuredfield qml_wsdl_import__cleanDB_32_message__sfield__Body__0
	"Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_cleanDB__0;
}
creator.sequencetype qml_wsdl_import__seq__SOAP_32_Header_32_for_32_cleanDB__0
"SOAP Header for cleanDB"
{
}
creator.sequencetype qml_wsdl_import__seq__SOAP_32_Body_32_for_32_cleanDB__0
"SOAP Body for cleanDB"
{
	creator.structuredfield qml_wsdl_import__cleanDB_32_body__sfield__cleanDB__0
	"cleanDB"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__cleanDB__0;
}
creator.sequencetype qml_wsdl_import__seq__cleanDB__0 "cleanDB"
	namespace = "http://service.parabank.parasoft.com/"
{
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_cleanDBResponse__0
"SOAP Envelope for cleanDBResponse"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__out__0 ]
{
	creator.structuredfield
	qml_wsdl_import__cleanDBResponse_32_message__sfield__Header__0 "Header"
		type = qml_wsdl_import__seq__SOAP_32_Header_32_for_32_cleanDBResponse__0
		optional;
	creator.structuredfield
	qml_wsdl_import__cleanDBResponse_32_message__sfield__Body__0 "Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_cleanDBResponse__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_cleanDBResponse__0
"SOAP Header for cleanDBResponse"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_cleanDBResponse__0
"SOAP Body for cleanDBResponse"
{
	creator.structuredfield
	qml_wsdl_import__cleanDBResponse_32_body__sfield__cleanDBResponse__0
	"cleanDBResponse"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__cleanDBResponse__0;
}
creator.sequencetype qml_wsdl_import__seq__cleanDBResponse__0
"cleanDBResponse"
	namespace = "http://service.parabank.parasoft.com/"
{
}
creator.message qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_getAccount__0
"SOAP Envelope for getAccount"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__in__0 ]
{
	creator.structuredfield
	qml_wsdl_import__getAccount_32_message__sfield__Header__0 "Header"
		type = qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getAccount__0
		optional;
	creator.structuredfield
	qml_wsdl_import__getAccount_32_message__sfield__Body__0 "Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getAccount__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getAccount__0
"SOAP Header for getAccount"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getAccount__0
"SOAP Body for getAccount"
{
	creator.structuredfield
	qml_wsdl_import__getAccount_32_body__sfield__getAccount__0 "getAccount"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__getAccount__0;
}
creator.sequencetype qml_wsdl_import__seq__getAccount__0 "getAccount"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.primitivefield qml_wsdl_import__getAccount__pfield__accountId__0
	"accountId"
		namespace = "http://service.parabank.parasoft.com/"
		type = number;
}
creator.message
qml_wsdl_import__msg__SOAP_32_Envelope_32_for_32_getAccountResponse__0
"SOAP Envelope for getAccountResponse"
	interfaces = [ qml_wsdl_import__port__ParaBankServiceImplPort__out__0 ]
{
	creator.structuredfield
	qml_wsdl_import__getAccountResponse_32_message__sfield__Header__0 "Header"
		type = qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getAccountResponse__0
		optional;
	creator.structuredfield
	qml_wsdl_import__getAccountResponse_32_message__sfield__Body__0 "Body"
		type = qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getAccountResponse__0;
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Header_32_for_32_getAccountResponse__0
"SOAP Header for getAccountResponse"
{
}
creator.sequencetype
qml_wsdl_import__seq__SOAP_32_Body_32_for_32_getAccountResponse__0
"SOAP Body for getAccountResponse"
{
	creator.structuredfield
	qml_wsdl_import__getAccountResponse_32_body__sfield__getAccountResponse__0
	"getAccountResponse"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__getAccountResponse__0;
}
creator.sequencetype qml_wsdl_import__seq__getAccountResponse__0
"getAccountResponse"
	namespace = "http://service.parabank.parasoft.com/"
{
	creator.structuredfield
	qml_wsdl_import__getAccountResponse__sfield__account__0 "account"
		namespace = "http://service.parabank.parasoft.com/"
		type = qml_wsdl_import__seq__account__0;
}