package syn_java_serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SYN_JAVA_SERIALIZABLE {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Characteristic[] commonwealth = new Characteristic[2];

        Characteristic Kazakhstan = new Characteristic("Repunlic of Kazakhstan", "Tenge", "Nur-Sultan");

        Characteristic Russia = new Characteristic("Russian Federation", "Ruble", "Moscow");
        Russia.setCountry(Kazakhstan);

        commonwealth[0] = Kazakhstan;
        commonwealth[1] = Russia;

        try ( // Сброс данных объекта commonwealth в файл (сериализация данных)
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("characteristic.dat"))) {
            out.writeObject(commonwealth);

        } catch (Exception e) {
        }
        try ( // Чтение сериализованных данных из файла в объект (десериализация данных)
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("characteristic.dat"))) {
            Characteristic[] newCommonwealth = (Characteristic[]) in.readObject();
            in.close();

            for (Characteristic country : newCommonwealth) {
                System.out.println(country);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
