package br.com.fiap.pos.soat3.pagamento.infrastructure.persistence;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;
import java.util.Date;

@DynamoDBTable(tableName = "pagamento-service-table")
public class PagamentoEntity {
    @DynamoDBAttribute(attributeName = "pagamento-id")
    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private String pagamentoId;
    @DynamoDBAttribute
    private String pedidoId;
    @DynamoDBAttribute
    private String clienteId;
    @DynamoDBAttribute
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss", shape = JsonFormat.Shape.STRING)
    private String dataDeCriacao;
    @DynamoDBAttribute
    private String valor;
    @DynamoDBAttribute
    private String status;
    @DynamoDBAttribute
    private String qrCode;
    @DynamoDBAttribute
    private String webhook;

    public PagamentoEntity() {
    }

    public PagamentoEntity(String pagamentoId, String pedidoId, String clienteId, String valor, String status, String qrCode, String webhook) {
        this.pagamentoId = pagamentoId;
        this.pedidoId = pedidoId;
        this.clienteId = clienteId;
        this.valor = valor;
        this.status = status;
        this.qrCode = qrCode;
        this.webhook = webhook;
    }

    public String getPagamentoId() {
        return pagamentoId;
    }

    public String getPedidoId() {
        return pedidoId;
    }

    public String getClienteId() {
        return clienteId;
    }

    public String getDataDeCriacao() {
        return dataDeCriacao;
    }

    public String getValor() {
        return valor;
    }

    public String getStatus() {
        return status;
    }

    public String getQrCode() {
        return qrCode;
    }

    public String getWebhook() {
        return webhook;
    }

    public void setPagamentoId(String pagamentoId) {
        this.pagamentoId = pagamentoId;
    }

    public void setPedidoId(String pedidoId) {
        this.pedidoId = pedidoId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public void setDataDeCriacao(String dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public void setWebhook(String webhook) {
        this.webhook = webhook;
    }
}
