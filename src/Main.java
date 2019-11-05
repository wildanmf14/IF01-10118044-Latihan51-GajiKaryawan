import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        Karyawan kr = new Karyawan();
        Manager mn = new Manager();

        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK\t\t\t: ");
        kr.setNik(scn.nextLine());
        System.out.print("Masukkan Nama\t\t\t: ");
        kr.setNama(scn.nextLine());
        System.out.print("Masukkan Golongan (1/2/3)\t: ");
        kr.setGolongan(scn.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag): ");
        kr.setJabatan(scn2.nextLine());
        System.out.print("Masukkan Jumlah Kehadiran\t: ");
        mn.setKehadiran(scn.nextInt());

        System.out.println("\n====Hasil Perhitungan====");
        System.out.printf("NIK \t\t: %s%n", kr.getNik());
        System.out.printf("NAMA \t\t: %s%n", kr.getNama());
        System.out.printf("GOLONGAN \t: %d%n", kr.getGolongan());
        System.out.printf("JABATAN \t: %s%n%n", kr.getJabatan());

        System.out.printf("TUNJANGAN GOLONGAN\t: %.1f%n", mn.tunjanganGolongan(kr.getGolongan()));
        System.out.printf("TUNJANGAN JABATAN\t: %.1f%n", mn.tunjanganJabatan(kr.getJabatan()));
        System.out.printf("TUNJANGAN KEHADIRAN\t: %.1f%n%n", mn.tunjanganKehadiran(mn.getKehadiran()));
        System.out.printf("GAJI TOTAL\t\t: %.1f%n", mn.gajiTotal());

    }

	

}
