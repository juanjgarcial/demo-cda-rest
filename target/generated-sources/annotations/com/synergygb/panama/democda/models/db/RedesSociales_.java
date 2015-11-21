package com.synergygb.panama.democda.models.db;

import com.synergygb.panama.democda.models.db.Contactos;
import com.synergygb.panama.democda.models.db.TipoRedes;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-20T11:08:29")
@StaticMetamodel(RedesSociales.class)
public class RedesSociales_ { 

    public static volatile SingularAttribute<RedesSociales, Date> rdateUpdate;
    public static volatile SingularAttribute<RedesSociales, String> ruserCreate;
    public static volatile SingularAttribute<RedesSociales, Date> rdateCreate;
    public static volatile SingularAttribute<RedesSociales, String> rTitle;
    public static volatile SingularAttribute<RedesSociales, TipoRedes> rTipo;
    public static volatile SingularAttribute<RedesSociales, Contactos> ridContacto;
    public static volatile SingularAttribute<RedesSociales, String> ruserUpdate;
    public static volatile SingularAttribute<RedesSociales, String> rLink;
    public static volatile SingularAttribute<RedesSociales, Integer> rId;

}