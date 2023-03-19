public class Repository {
    private Proguct[] progucts = new Proguct[0];

    public void add(Proguct proguct) {
        Proguct[] tmp = new Proguct[progucts.length + 1];
        for (int i = 0; i < progucts.length; i++) {
            tmp[i] = progucts[i];
        }
        tmp[tmp.length - 1] = proguct;
        progucts = tmp;
    }

    public Proguct[] findAll() {
        return progucts;
    }

    public void removeById(int removeId) {
        Proguct[] tmp = new Proguct[progucts.length - 1];
        int index = 0;
        for (Proguct proguct : progucts) {
            if (proguct.getId() != removeId) {
                tmp[index] = proguct;
            index++;
            }
        }
progucts = tmp;
    }
}
