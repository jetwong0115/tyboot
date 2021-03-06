package org.typroject.tyboot.core.auth.face.orm.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.typroject.tyboot.core.rdbms.orm.entity.BaseEntity;

import java.util.Date;

/**
 * <p>
 * 登录SESSION
 * </p>
 *
 * @author magintursh
 * @since 2017-08-18
 */

@EqualsAndHashCode(callSuper = true)
@Data
@TableName("auth_sso_sessions")
public class SsoSessions extends BaseEntity {

    private static final long serialVersionUID = 12345645613535L;

    /**
     * 归属机构
     */
	@TableField("AGENCY_CODE")
	private String agencyCode;
    /**
     * 登录账号
     */
	@TableField("LOGIN_ID")
	private String loginId;
    /**
     * 用户编号
     */
	@TableField("USER_ID")
	private String userId;
    /**
     * 用户名
     */
	@TableField("USER_NAME")
	private String userName;
    /**
     * 用户类型
     */
	@TableField("USER_TYPE")
	private String userType;
    /**
     * 来源产品
     */
	@TableField("ACTION_BY_PRODUCT")
	private String actionByProduct;
    /**
     * 来源IP
     */
	@TableField("ACTION_BY_IP")
	private String actionByIp;
    /**
     * 过期时限(秒）
     */
	@TableField("SESSION_EXPIRATION")
	private Long sessionExpiration;
    /**
     * session状态：激活，过期
     */
	@TableField("SESSION_STATUS")
	private String sessionStatus;
    /**
     * 创建时间
     */
	@TableField("SESSION_CREATE_TIME")
	private Date sessionCreateTime;
	@TableField("ACTION_BY_AGENT")
	private String actionByAgent;
    /**
     * 来源设备串码
     */
	@TableField("SOURCE_DEVICE_CODE")
	private String sourceDeviceCode;
    /**
     * 来源平台
     */
	@TableField("SOURCE_OS")
	private String sourceOs;


	@TableField("TOKEN")
	private String token;
}
