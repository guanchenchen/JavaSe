package CH14;

import java.io.File;
import java.util.ArrayList;

public class FileDemo {
	public static void main(String[] args) {
		try {
			File file = new File("d:" + File.separator + "FileDemo.txt");
			if (file.isFile()) { // �Ƿ��n��
				// System.out.println(args[0] + " �n��");
				System.out.print(file.canRead() ? "���x " : "�����x ");
				System.out.print(file.canWrite() ? "�Ɍ� " : "���Ɍ� ");
				System.out.println(file.length() + "λԪ�M");
			} else {
				// �г����еęn����Ŀ�
				File[] files = file.listFiles();
				ArrayList<File> fileList = new ArrayList<File>();
				for (int i = 0; i < files.length; i++) {
					// ���г�Ŀ�
					if (files[i].isDirectory()) { // �Ƿ��Ŀ�
						// ȡ��·����
						System.out.println("[" + files[i].getPath() + "]");
					} else {
						// �n���ȴ���fileList���������г�
						fileList.add(files[i]);
					}
				}

				// �г��n��
				for (File f : fileList) {
					System.out.println(f.toString());
				}
				System.out.println();
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("using: java FileDemo pathname");
		}
	}

}
