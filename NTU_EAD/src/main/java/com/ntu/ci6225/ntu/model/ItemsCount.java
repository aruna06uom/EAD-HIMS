package com.ntu.ci6225.ntu.model;


public class ItemsCount {

    private Long alldrugsExpired;
	private Long alldrugsNonExpired;
    private Long allequipmentExpired;
    private Long allequipmentNonExpired;
    
    public Long getAlldrugsExpired() {
		return alldrugsExpired;
	}
	public void setAlldrugsExpired(Long alldrugsExpired) {
		this.alldrugsExpired = alldrugsExpired;
	}
	public Long getAlldrugsNonExpired() {
		return alldrugsNonExpired;
	}
	public void setAlldrugsNonExpired(Long alldrugsNonExpired) {
		this.alldrugsNonExpired = alldrugsNonExpired;
	}
	public Long getAllequipmentExpired() {
		return allequipmentExpired;
	}
	public void setAllequipmentExpired(Long allequipmentExpired) {
		this.allequipmentExpired = allequipmentExpired;
	}
	public Long getAllequipmentNonExpired() {
		return allequipmentNonExpired;
	}
	public void setAllequipmentNonExpired(Long allequipmentNonExpired) {
		this.allequipmentNonExpired = allequipmentNonExpired;
	}
    
}
