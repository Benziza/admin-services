package io.mosip.idrepository.vid.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The Class UinHashSalt.
 * 
 * @author Prem Kumar.
 *
 */
@Data
@Entity
@NoArgsConstructor
@Table(schema = "idmap")
public class UinHashSalt {

	/** The Id value */
	@Id
	private int id;

	/** The salt value */
	@Column(name = "salt")
	private String salt;

	/** The value to hold created By */
	@Column(name = "cr_by")
	private String createdBy;

	/** The value to hold created DTimes */
	@Column(name = "cr_dtimes")
	private LocalDateTime createdDTimes;

	/** The value to hold updated By */
	@Column(name = "upd_by")
	private String updatedBy;

	/** The value to hold updated Time */
	@Column(name = "upd_dtimes")
	private LocalDateTime updatedDTimes;
}
