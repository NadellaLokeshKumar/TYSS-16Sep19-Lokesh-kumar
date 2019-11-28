package com.ty.jpawithybernateapp.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Entity
@Data
@Table(name="votercard")
public class VoterCard {
	
	@Id
	@Column
	private int vid;
	@Column
	private String vname;
	@Exclude				// here we are using lombok,we have to exclude tostring.
	@OneToOne(mappedBy = "voterCard")
	private Person person;
}
