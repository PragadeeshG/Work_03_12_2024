create table if not exists model_resolvable_job(
model_based_device_id Integer not null,
model_based_device_name varchar(255) null,
model_based_device_registry varchar(255) null,
model_based_device_start_time varchar(255) null,
model_based_device_approved_time varchar(255) null,
model_based_device_owner varchar(255) null,
authorized_device char null,
time_out_in_seconds varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint model_resolvable_job_pk primary key(model_based_device_id));