package com.atguigu.mtimeapp.panchangkun.domain;

import java.util.List;

/**
 * Created by Administrator on 2016/4/19.
 */
public class MovieDetailPeopleBean {

    /**
     * typeName : 导演
     * typeNameEn : Director
     * persons : [{"id":1726823,"name":"巴巴克·纳加非","nameEn":"Babak Najafi","image":"http://img31.mtime.cn/ph/2016/01/14/145633.63440844_1280X720X2.jpg"}]
     */

    private List<TypesEntity> types;

    public void setTypes(List<TypesEntity> types) {
        this.types = types;
    }

    public List<TypesEntity> getTypes() {
        return types;
    }

    public static class TypesEntity {
        private String typeName;
        private String typeNameEn;
        /**
         * id : 1726823
         * name : 巴巴克·纳加非
         * nameEn : Babak Najafi
         * image : http://img31.mtime.cn/ph/2016/01/14/145633.63440844_1280X720X2.jpg
         */

        private List<PersonsEntity> persons;

        public void setTypeName(String typeName) {
            this.typeName = typeName;
        }

        public void setTypeNameEn(String typeNameEn) {
            this.typeNameEn = typeNameEn;
        }

        public void setPersons(List<PersonsEntity> persons) {
            this.persons = persons;
        }

        public String getTypeName() {
            return typeName;
        }

        public String getTypeNameEn() {
            return typeNameEn;
        }

        public List<PersonsEntity> getPersons() {
            return persons;
        }

        public static class PersonsEntity {
            private int id;
            private String name;
            private String nameEn;
            private String image;

            public void setId(int id) {
                this.id = id;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setNameEn(String nameEn) {
                this.nameEn = nameEn;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public int getId() {
                return id;
            }

            public String getName() {
                return name;
            }

            public String getNameEn() {
                return nameEn;
            }

            public String getImage() {
                return image;
            }
        }
    }
}
