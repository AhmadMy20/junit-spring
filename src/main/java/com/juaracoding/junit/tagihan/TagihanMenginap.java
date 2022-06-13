package com.juaracoding.junit.tagihan;

import java.beans.Statement;

import com.juaracoding.junit.pasien.Pasien;

public class TagihanMenginap {
	public double totalTagihan(Pasien pasien) {
		double total = 0;
		
		if (pasien.getKelas().equals("kelas vip")) {
			total = 250000 * pasien.getMenginap();
		}else if(pasien.getKelas().equals("kelas 1")) {
			total = 200000 * pasien.getMenginap();
		}
		return total;
	}
	String statement;
	public String cekGanjilGenap(int tgl, int platNomor) {
		if (tgl%2==0) {
			if(platNomor%2==0) {
				statement ="Diijinkan";
			}else {
				statement = "Dilarang";
			}
		}else if((tgl%2==1)) {
			if(platNomor%2==1) {
				statement = "Diijinkan";
			}else {
				statement = "Dilarang";
			}
		}
		return statement;
		
	}
}
