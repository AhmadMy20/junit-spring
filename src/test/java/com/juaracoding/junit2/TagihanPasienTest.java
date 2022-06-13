package com.juaracoding.junit2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.juaracoding.junit.pasien.Pasien;
import com.juaracoding.junit.tagihan.TagihanMenginap;

public class TagihanPasienTest {
	
	Pasien pasien;
	TagihanMenginap tagihanmenginap;

	@Before
	public void setUp()  {
		pasien = new Pasien();
		tagihanmenginap = new TagihanMenginap();
	}

	@Test
	public void tesTotalTagihanKlsVIP() {
		pasien.setKelas("kelas vip");
		pasien.setMenginap(3);
		double expect = 750000;
		double actual = tagihanmenginap.totalTagihan(pasien);
		assertEquals(expect, actual, 0.0);
	}
	@Test
	public void tesTotalTagihanKls1() {
		pasien.setKelas("kelas 1 ");
		pasien.setMenginap(3);
		double expect = 600000;
		double actual = tagihanmenginap.totalTagihan(pasien);
		assertEquals(expect, actual, 600000);
	}
	@Test
	public void tesDiijinkan1() {
		String expect = "Diijinkan";
		String actual = tagihanmenginap.cekGanjilGenap(12, 1234);
		assertEquals(expect, actual);
	}
	@Test
	public void tesDilarang1() {
		String expect = "Dilarang";
		String actual = tagihanmenginap.cekGanjilGenap(12, 1235);
		assertEquals(expect, actual);
	}
	@Test
	public void tesDiijinkan() {
		String expect = "Diijinkan";
		String actual = tagihanmenginap.cekGanjilGenap(13, 1235);
		assertEquals(expect, actual);
	}
	@Test
	public void tesDilarang() {
		String expect = "Dilarang";
		String actual = tagihanmenginap.cekGanjilGenap(13, 1234);
		assertEquals(expect, actual);
	}

}
