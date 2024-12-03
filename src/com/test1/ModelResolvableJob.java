package com.test1;

public class ModelResolvableJob {
	private Integer modelBasedDeviceId;
	private String modelBasedDeviceName;
	private String modelBasedDeviceRegistry;
	private String modelBasedDeviceStartTime;
	private String modelBasedDeviceApprovedTime;
	private String modelBasedDeviceOwner;
	private boolean authorizedDevice;
	private String timeOutInSeconds;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public ModelResolvableJob() {

	}

	public ModelResolvableJob(Integer modelBasedDeviceId, String modelBasedDeviceName, String modelBasedDeviceRegistry,
			String modelBasedDeviceStartTime, String modelBasedDeviceApprovedTime, String modelBasedDeviceOwner,
			boolean authorizedDevice, String timeOutInSeconds, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.modelBasedDeviceId = modelBasedDeviceId;
		this.modelBasedDeviceName = modelBasedDeviceName;
		this.modelBasedDeviceRegistry = modelBasedDeviceRegistry;
		this.modelBasedDeviceStartTime = modelBasedDeviceStartTime;
		this.modelBasedDeviceApprovedTime = modelBasedDeviceApprovedTime;
		this.modelBasedDeviceOwner = modelBasedDeviceOwner;
		this.authorizedDevice = authorizedDevice;
		this.timeOutInSeconds = timeOutInSeconds;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getModelBasedDeviceId() {
		return modelBasedDeviceId;
	}

	public void setModelBasedDeviceId(Integer modelBasedDeviceId) {
		this.modelBasedDeviceId = modelBasedDeviceId;
	}

	public String getModelBasedDeviceName() {
		return modelBasedDeviceName;
	}

	public void setModelBasedDeviceName(String modelBasedDeviceName) {
		this.modelBasedDeviceName = modelBasedDeviceName;
	}

	public String getModelBasedDeviceRegistry() {
		return modelBasedDeviceRegistry;
	}

	public void setModelBasedDeviceRegistry(String modelBasedDeviceRegistry) {
		this.modelBasedDeviceRegistry = modelBasedDeviceRegistry;
	}

	public String getModelBasedDeviceStartTime() {
		return modelBasedDeviceStartTime;
	}

	public void setModelBasedDeviceStartTime(String modelBasedDeviceStartTime) {
		this.modelBasedDeviceStartTime = modelBasedDeviceStartTime;
	}

	public String getModelBasedDeviceApprovedTime() {
		return modelBasedDeviceApprovedTime;
	}

	public void setModelBasedDeviceApprovedTime(String modelBasedDeviceApprovedTime) {
		this.modelBasedDeviceApprovedTime = modelBasedDeviceApprovedTime;
	}

	public String getModelBasedDeviceOwner() {
		return modelBasedDeviceOwner;
	}

	public void setModelBasedDeviceOwner(String modelBasedDeviceOwner) {
		this.modelBasedDeviceOwner = modelBasedDeviceOwner;
	}

	public boolean isAuthorizedDevice() {
		return authorizedDevice;
	}

	public void setAuthorizedDevice(boolean authorizedDevice) {
		this.authorizedDevice = authorizedDevice;
	}

	public String getTimeOutInSeconds() {
		return timeOutInSeconds;
	}

	public void setTimeOutInSeconds(String timeOutInSeconds) {
		this.timeOutInSeconds = timeOutInSeconds;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
