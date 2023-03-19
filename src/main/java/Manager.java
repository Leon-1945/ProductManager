public class Manager {
    private Repository repository;

    public Manager(Repository repository) {
        this.repository = repository;
    }

    public void add(Proguct proguct) {
        repository.add(proguct);
    }

    public Proguct[] searchBy(String text) {
        Proguct[] result = new Proguct[0]; // тут будем хранить подошедшие запросу продукты
        for (Proguct proguct : repository.findAll()) {
            if (matches(proguct, text)) {
                // "добавляем в конец" массива result продукт product
                Proguct[] tmp = new Proguct[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];

                }
                tmp[tmp.length - 1] = proguct;
                result = tmp;
            }
        }
        return result;
    }

    // метод определения соответствия товара product запросу search
    public boolean matches(Proguct product, String search) {
        return product.getName().contains(search);
    }
}
