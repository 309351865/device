package com.ynd.device.model.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public enum ErrorCode
{
    FAIL, SUCCESS, error_pic_file, error_pic_upload, error_record_not_found, error_max_page_size, error_create_failed, error_update_failed, error_delete_failed, error_search_failed, error_count_failed, error_string_to_obj, error_invalid_argument, error_update_not_allowed, error_duplicated_data, error_unknown_database_operation, error_column_unique, error_file_download, error_file_upload, http_status_bad_request, http_status_unauthorized, http_status_payment_required, http_status_forbidden, http_status_not_found, http_status_method_not_allowed, http_status_not_acceptable, http_status_proxy_authentication_required, http_status_request_timeout, http_status_conflict, http_status_gone, http_status_length_required, http_status_precondition_failed, http_status_payload_too_large, http_status_uri_too_long, http_status_unsupported_media_type, http_status_requested_range_not_satisfiable, http_status_expectation_failed, http_status_im_a_teapot, http_status_unprocessable_entity, http_status_locked, http_status_failed_dependency, http_status_upgrade_required, http_status_precondition_required, http_status_too_many_requests, http_status_request_header_fields_too_large, http_status_internal_server_error, http_status_not_implemented, http_status_bad_gateway, http_status_service_unavailable, http_status_gateway_timeout, http_status_http_version_not_supported, http_status_variant_also_negotiates, http_status_insufficient_storage, http_status_loop_detected, http_status_bandwidth_limit_exceeded, http_status_not_extended, http_status_network_authentication_required, EXCEPTION, INVALID_PARAM, INVALID_PRIVI, no_weekly_login, no_login, sms_limit, sms_error, verifycode_no_pass, login_invalid_username_or_password, login_already_logined, login_permission_denied, login_invalid_old_password, login_invalid_kaptcha, account_invalid_acount_name, account_invalid_email_format, order_operation_invalid, has_bean_binded, error_phone_number, product_update_status_error, product_not_exist, product_used_up, wellnessBloodGlucose_highest_lowest_avg_error, survey_question_not_exist, survey_answer_is_null, survey_create_version_number_error, survey_only_written_once, survey_not_released, survey_code_repeated, stock_sequence_initialization_not_finished, stock_barcode_not_found, stock_box_barcode_used, stock_collector_barcode_used, stock_collector_number_unfit_for_box, stock_collector_types_unfit_for_box, stock_box_not_left_in_this_batch, stock_collector_not_left_in_this_batch, stock_batch_num_already_exist, stock_collector_num_err, stock_storage_default_collector_storage_record_not_found, stock_collector_barcode_not_match_any_batch, stock_collector_barcode_repeat, stock_collector_type_repeat, stock_batch_num_not_match_collector_type, stock_to_3rd_supplier_create_failed, stock_to_3rd_supplier_update_failed, stock_to_3rd_sku_create_failed, stock_to_3rd_sku_update_failed, CREATE_SF_PUTIN_ERR, id_is_used, HAVE_INIT, NOT_INIT, SAMPLERSEGMENT_ADD_ERR, SAMPLERSEGMENT_DEL_ERR, SAMPLERBOXSEGMENT_ADD_ERR, SAMPLERBOXSEGMENT_DEL_ERR, SAMPLERBOXSEGMENT_NOTEXIST_ERR, LOGISTICORDER_ADD_ERR, LOGISTICORDER_DEL_ERR, LOGISTICORDER_UPDATE_ERR, SAMPLERSEGMENT_CHAGESTATUS_ERR, SAMPLERSEGMENT_STATUS_DISABLED_ERR, SAMPLERSEGMENT_NOT_EXIST, KUAIDI100_SUBSCRIBER_ERR, KUAIDI100_QUERY_ERR, USER_EXIST, USER_NOT_EXIST, USER_PASSWORD_ERR, ROLE_NOT_EXIST, USER_ACCESS_DENIED, USERNAME_EMAIL_ERR, NULL_TOKEN, CALL_API_FAIL, SF_FAILURE, SAMPLE_NOT_FOUND, SAMPLE_PARENT_NOT_FOUND, SAMPLE_FREEZE_BOX_CELL_USED, SAMPLE_FREEZE_BOX_TYPE_NOT_FOUND, SAMPLE_FREEZE_BOX_NOT_FOUND, SAMPLE_FREEZE_SHELF_TYPE_NOT_FOUND, LAB_SAMPLE_EXAM_NOT_FOUND, SAMPLE_CONTAINER_NOT_FOUND, SAMPLE_DERIVE_STENCIL_EXITS, SAMPLE_DERIVE_STENCIL_INVALID_DETAIL, SAMPLE_UPLOAD_FORMAT_ERR, SAMPLE_UPLOAD_FORMAT_ERR_1, SAMPLE_UPLOAD_FORMAT_ERR_2, SAMPLE_UPLOAD_RESULT_FILE_ERR, DNA_TASK_FINISHED_ERR, SAMPLE_UPLOAD_DNA_SALT_ERR, SAMPLE_SHOULD_NUMBER_ERR, SAMPLES_COUNT_PLAN_ACTUAL, SAMPLE_FLOW_NOT_EXIST_ERR, SAMPLE_FLOW_EXIST_ERR;

    private static final Logger LOGGER;
    private int code;
    private String msg;

    public static int getCode(String define)
    {
        try
        {
            return valueOf(define).code;
        } catch (IllegalArgumentException e) {
            LOGGER.error("undefined error code: {}", define); }
        return FAIL.getErrorCode();
    }

    public static String getMsg(String define)
    {
        try {
            return valueOf(define).msg;
        } catch (IllegalArgumentException e) {
            LOGGER.error("undefined error code: {}", define); }
        return FAIL.getErrorMsg();
    }

    public static String getMsg(int code)
    {
        for (ErrorCode err : values()) {
            if (err.code == code) {
                return err.msg;
            }
        }
        return "errorCode not defined ";
    }

    public int getErrorCode() {
        return this.code;
    }

    public String getErrorMsg() {
        return this.msg;
    }

    static
    {
        LOGGER = LoggerFactory.getLogger(ErrorCode.class);
    }
}
