
package com.ebay.marketplace.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.5-b03-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "BulkDataExchangeServicePort", targetNamespace = "http://www.ebay.com/marketplace/services")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BulkDataExchangeServicePort {


    /**
     * 
     * @param params
     * @return
     *     returns com.ebay.marketplace.services.CreateUploadJobResponse
     */
    @WebMethod
    @WebResult(name = "createUploadJobResponse", targetNamespace = "http://www.ebay.com/marketplace/services", partName = "params")
    public CreateUploadJobResponse createUploadJob(
        @WebParam(name = "createUploadJobRequest", targetNamespace = "http://www.ebay.com/marketplace/services", partName = "params")
        CreateUploadJobRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns com.ebay.marketplace.services.StartUploadJobResponse
     */
    @WebMethod
    @WebResult(name = "startUploadJobResponse", targetNamespace = "http://www.ebay.com/marketplace/services", partName = "params")
    public StartUploadJobResponse startUploadJob(
        @WebParam(name = "startUploadJobRequest", targetNamespace = "http://www.ebay.com/marketplace/services", partName = "params")
        StartUploadJobRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns com.ebay.marketplace.services.AbortJobResponse
     */
    @WebMethod
    @WebResult(name = "abortJobResponse", targetNamespace = "http://www.ebay.com/marketplace/services", partName = "params")
    public AbortJobResponse abortJob(
        @WebParam(name = "abortJobRequest", targetNamespace = "http://www.ebay.com/marketplace/services", partName = "params")
        AbortJobRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns com.ebay.marketplace.services.GetJobsResponse
     */
    @WebMethod
    @WebResult(name = "getJobsResponse", targetNamespace = "http://www.ebay.com/marketplace/services", partName = "params")
    public GetJobsResponse getJobs(
        @WebParam(name = "getJobsRequest", targetNamespace = "http://www.ebay.com/marketplace/services", partName = "params")
        GetJobsRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns com.ebay.marketplace.services.GetJobStatusResponse
     */
    @WebMethod
    @WebResult(name = "getJobStatusResponse", targetNamespace = "http://www.ebay.com/marketplace/services", partName = "params")
    public GetJobStatusResponse getJobStatus(
        @WebParam(name = "getJobStatusRequest", targetNamespace = "http://www.ebay.com/marketplace/services", partName = "params")
        GetJobStatusRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns com.ebay.marketplace.services.StartDownloadJobResponse
     */
    @WebMethod
    @WebResult(name = "startDownloadJobResponse", targetNamespace = "http://www.ebay.com/marketplace/services", partName = "params")
    public StartDownloadJobResponse startDownloadJob(
        @WebParam(name = "startDownloadJobRequest", targetNamespace = "http://www.ebay.com/marketplace/services", partName = "params")
        StartDownloadJobRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns com.ebay.marketplace.services.CreateRecurringJobResponse
     */
    @WebMethod
    @WebResult(name = "createRecurringJobResponse", targetNamespace = "http://www.ebay.com/marketplace/services", partName = "params")
    public CreateRecurringJobResponse createRecurringJob(
        @WebParam(name = "createRecurringJobRequest", targetNamespace = "http://www.ebay.com/marketplace/services", partName = "params")
        CreateRecurringJobRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns com.ebay.marketplace.services.DeleteRecurringJobResponse
     */
    @WebMethod
    @WebResult(name = "deleteRecurringJobResponse", targetNamespace = "http://www.ebay.com/marketplace/services", partName = "params")
    public DeleteRecurringJobResponse deleteRecurringJob(
        @WebParam(name = "deleteRecurringJobRequest", targetNamespace = "http://www.ebay.com/marketplace/services", partName = "params")
        DeleteRecurringJobRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns com.ebay.marketplace.services.GetRecurringJobsResponse
     */
    @WebMethod
    @WebResult(name = "getRecurringJobsResponse", targetNamespace = "http://www.ebay.com/marketplace/services", partName = "params")
    public GetRecurringJobsResponse getRecurringJobs(
        @WebParam(name = "getRecurringJobsRequest", targetNamespace = "http://www.ebay.com/marketplace/services", partName = "params")
        GetRecurringJobsRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns com.ebay.marketplace.services.GetRecurringJobExecutionStatusResponse
     */
    @WebMethod
    @WebResult(name = "getRecurringJobExecutionStatusResponse", targetNamespace = "http://www.ebay.com/marketplace/services", partName = "params")
    public GetRecurringJobExecutionStatusResponse getRecurringJobExecutionStatus(
        @WebParam(name = "getRecurringJobExecutionStatusRequest", targetNamespace = "http://www.ebay.com/marketplace/services", partName = "params")
        GetRecurringJobExecutionStatusRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns com.ebay.marketplace.services.GetRecurringJobExecutionHistoryResponse
     */
    @WebMethod
    @WebResult(name = "getRecurringJobExecutionHistoryResponse", targetNamespace = "http://www.ebay.com/marketplace/services", partName = "params")
    public GetRecurringJobExecutionHistoryResponse getRecurringJobExecutionHistory(
        @WebParam(name = "getRecurringJobExecutionHistoryRequest", targetNamespace = "http://www.ebay.com/marketplace/services", partName = "params")
        GetRecurringJobExecutionHistoryRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns com.ebay.marketplace.services.ActivateRecurringJobResponse
     */
    @WebMethod
    @WebResult(name = "activateRecurringJobResponse", targetNamespace = "http://www.ebay.com/marketplace/services", partName = "params")
    public ActivateRecurringJobResponse activateRecurringJob(
        @WebParam(name = "activateRecurringJobRequest", targetNamespace = "http://www.ebay.com/marketplace/services", partName = "params")
        ActivateRecurringJobRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns com.ebay.marketplace.services.SuspendRecurringJobResponse
     */
    @WebMethod
    @WebResult(name = "suspendRecurringJobResponse", targetNamespace = "http://www.ebay.com/marketplace/services", partName = "params")
    public SuspendRecurringJobResponse suspendRecurringJob(
        @WebParam(name = "suspendRecurringJobRequest", targetNamespace = "http://www.ebay.com/marketplace/services", partName = "params")
        SuspendRecurringJobRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns com.ebay.marketplace.services.AbortRecurringJobExecutionResponse
     */
    @WebMethod
    @WebResult(name = "abortRecurringJobExecutionResponse", targetNamespace = "http://www.ebay.com/marketplace/services", partName = "params")
    public AbortRecurringJobExecutionResponse abortRecurringJobExecution(
        @WebParam(name = "abortRecurringJobExecutionRequest", targetNamespace = "http://www.ebay.com/marketplace/services", partName = "params")
        AbortRecurringJobExecutionRequest params);

}
