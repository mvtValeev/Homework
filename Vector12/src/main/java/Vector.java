public class Vector {
    int x;
    int y;
    int z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    double length(){
        double ftype = Math.sqrt(x * x + y * y + z * z);
        return (int) ftype;
    }

    // метод, вычисляющий скалярное произведение
    double scalarProduct(Vector vector){
        return x * vector.x + y * vector.y + z * vector.z;
    }

    // метод, вычисляющий векторное произведение
    Vector crossProduct(Vector vector){
        return new Vector(y * vector.z - z * vector.y, z*vector.x - x*vector.z, x*vector.y - y*vector.x);
    }

    // Косинус между двумя векторами
    double cos(Vector vector){
        double d = this.scalarProduct(vector);
        double c = this.length();
        double g = vector.length();
        return d / (c * g);
    }

    // Сумма двух векторов
    Vector add(Vector vector){
        return new Vector(this.x + vector.x, this.y + vector.y,this.z + vector.z);
    }

    // Разность двух веторов
    Vector subtract(Vector vector){
        return new Vector(this.x - vector.x, this.y - vector.y,this.z - vector.z);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Vector vector1 = (Vector) obj;
        return (x == vector1.x) && (y == vector1.y) && (z == vector1.z);
    }
    @Override
    public int hashCode() {
        final int prime = 5;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        result = prime * result + z;
        return result;}

}
