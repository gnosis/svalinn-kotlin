package pm.gnosis.ethereum.rpc

import pm.gnosis.ethereum.rpc.models.*

interface EthereumRpcConnector {

    companion object {
        const val BLOCK_EARLIEST = "earliest"
        const val BLOCK_LATEST = "latest"
        const val BLOCK_PENDING = "pending"

        const val FUNCTION_GET_BALANCE = "eth_getBalance"
        const val FUNCTION_CALL = "eth_call"
        const val FUNCTION_ESTIMATE_GAS = "eth_estimateGas"
        const val FUNCTION_GAS_PRICE = "eth_gasPrice"
        const val FUNCTION_GET_TRANSACTION_COUNT = "eth_getTransactionCount"
        const val FUNCTION_GET_STORAGE_AT = "eth_getStorageAt"
        const val FUNCTION_SEND_RAW_TRANSACTION = "eth_sendRawTransaction"
    }

     fun receipt(jsonRpcRequest: JsonRpcRequest): JsonRpcTransactionReceiptResult

     fun block(jsonRpcRequest: JsonRpcRequest): JsonRpcBlockResult

     fun transaction(jsonRpcRequest: JsonRpcRequest): JsonRpcTransactionResult

     fun post(jsonRpcRequest: JsonRpcRequest): JsonRpcResult

     fun post(jsonRpcRequest: Collection<JsonRpcRequest>): Collection<JsonRpcResult>

}
