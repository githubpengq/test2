
import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

/**
 * ���̳��� http://bbs.datahref.com/ �ṩ Tess4j��֤��ʶ��ʾ�� ������tessdata�ļ��а�����ʶ��Ӣ�����������
 * ��Ҫʶ���������Կε�https://github.com/tesseract-ocr/tessdata����������� �ŵ�tessdata�ļ�����
 * 
 * @author hu
 *
 */
public class OCRDemo {

	public static void main(String[] args) throws TesseractException {
		ITesseract instance = new Tesseract();
		File imgDir = new File("img_data");
		// ��img_data�ļ����е�ÿ����֤�����ʶ��
		// �ļ�������ȷ�Ľ��
		for (File imgFile : imgDir.listFiles()) {
			// ��������������ļ���Ҳ������BufferedImage
			String ocrResult = instance.doOCR(imgFile);
			// ���ͼƬ�ļ���������ȷʶ����
			System.out.println("ImgFile: " + imgFile.getAbsolutePath());
			// ���ʶ����
			System.out.println("OCR Result: " + ocrResult);
		}
	}
}
