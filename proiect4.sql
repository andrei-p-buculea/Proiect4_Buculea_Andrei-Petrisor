DROP TABLE ipoteca;

DROP TABLE asigurare;

DROP TABLE client;

DROP TABLE filiala;

SET SERVEROUTPUT ON;

--CREAREA TABELELOR

CREATE TABLE filiala (
    cod_filiala    NUMBER,
    nume_filiala   VARCHAR2(80)
);

CREATE TABLE client (
    nr_client       NUMBER,
    adresa_client   VARCHAR2(40),
    nume_client     VARCHAR2(60)
);

CREATE TABLE asigurare (
    nr_cont                      VARCHAR2(50),
    tip_asigurare                VARCHAR2(40),
    cod_companie_asigurare       VARCHAR2(40),
    detalii_companie_asigurare   VARCHAR2(200)
);

CREATE TABLE ipoteca (
    nr_cont             VARCHAR2(40),
    cod_filiala         NUMBER,
    suma_imprumutata    FLOAT,
    suma_de_restituit   FLOAT,
    tip_cont            VARCHAR2(30),
    tip_ipoteca         VARCHAR2(30),
    rata_dobanzii       FLOAT,
    nr_client           NUMBER
);

--CONSTRANGERI DE INTEGRITATE

ALTER TABLE filiala ADD CONSTRAINT pk_filiala PRIMARY KEY ( cod_filiala );

ALTER TABLE client ADD CONSTRAINT pk_client PRIMARY KEY ( nr_client );

ALTER TABLE ipoteca
    ADD CONSTRAINT fk_nr_client FOREIGN KEY ( nr_client )
        REFERENCES client ( nr_client )
            ON DELETE SET NULL;

ALTER TABLE ipoteca
    ADD CONSTRAINT fk_cod_filiala FOREIGN KEY ( cod_filiala )
        REFERENCES filiala ( cod_filiala )
            ON DELETE SET NULL;

--creare trigger

CREATE OR REPLACE TRIGGER fil_before_ins BEFORE
    INSERT OR UPDATE ON filiala
    FOR EACH ROW
BEGIN
    IF :new.cod_filiala < 1 THEN
        raise_application_error(-20000, 'codul filialei trebuie sa fie >=1');
    END IF;
END;
/

CREATE OR REPLACE TRIGGER client_before_ins BEFORE
    INSERT OR UPDATE ON client
    FOR EACH ROW
BEGIN
    IF :new.nr_client < 1 THEN
        raise_application_error(-20000, 'numarul clientului trebuie sa fie >=1');
    END IF;
END;
/

--INSTANTIEREA BAZEI DE DATE

INSERT INTO filiala VALUES (
    1,
    'BRD Craiova'
);

INSERT INTO filiala VALUES (
    2,
    'BCR Craiova'
);

INSERT INTO filiala VALUES (
    3,
    'BT Craiova'
);

INSERT INTO filiala VALUES (
    4,
    'CEC Craiova'
);

INSERT INTO filiala VALUES (
    5,
    'Raiffeisen Craiova'
);

INSERT INTO filiala VALUES (
    6,
    'Libra Craiova'
);

INSERT INTO client VALUES (
    '1',
    'Calea Bucuresti ,Craiova,Dolj',
    'Popescu Ion'
);

INSERT INTO client VALUES (
    '2',
    'Strada Narciselor ,Craiova,Dolj',
    'Popa Ion'
);

INSERT INTO client VALUES (
    '3',
    'Strada Independentei ,Craiova,Dolj',
    'Popovici Ioan'
);

INSERT INTO client VALUES (
    '4',
    'Strada Bucovat ,Craiova,Dolj',
    'Popesco Ionel'
);

INSERT INTO client VALUES (
    '5',
    'Strada Damila ,Craiova,Dolj',
    'Pop Ionela'
);

INSERT INTO client VALUES (
    '6',
    'Calea Severinului,Craiova,Dolj',
    'Popovici Ion'
);

INSERT INTO client VALUES (
    '7',
    'Strada Spaniei ,Craiova,Dolj',
    'Popovici Ionela'
);

INSERT INTO client VALUES (
    '8',
    'Calea Severinului,Craiova,Dolj',
    'Marin Ion'
);

INSERT INTO asigurare VALUES (
    'RO54RZBR0000060015026273',
    'obligatorie',
    'RO-07',
    'ALLIANZ-TIRIAC ASIGURARI S.A.'
);

INSERT INTO asigurare VALUES (
    'RO54RZBR0000060015031373',
    'obligatorie',
    'RO-25',
    'SOCIETATEA DE ASIGURARE-REASIGURARE CITY INSURANCE S.A'
);

INSERT INTO asigurare VALUES (
    'RO54RZBR0000060015014473',
    'obligatorie',
    'RO-01',
    'ASIGURAREA ROMANEASCA - ASIROM VIENNA INSURANCE GROUP S.A.'
);

INSERT INTO asigurare VALUES (
    'RO54RZBR0000060015033973',
    'facultativa',
    'RO-16',
    'EUROINS ROMANIA ASIGURARE - REASIGURARE S.A.'
);

INSERT INTO ipoteca VALUES (
    'RO54BTRLRONCRT0500211001',
    1,
    2400.68,
    2700.87,
    'persoana fizica',
    'ipoteca prin deces',
    2.687,
    1
);

INSERT INTO ipoteca VALUES (
    'RO54BTRLRONCRT0321456301',
    1,
    2400.68,
    2700.87,
    'persoana fizica',
    'ipoteca prin deces',
    14.877,
    1
);

INSERT INTO ipoteca VALUES (
    'RO54BTRLRONCRT0589411001',
    1,
    2400.68,
    2700.87,
    'persoana fizica',
    'ipoteca prin deces',
    24.11,
    1
);

INSERT INTO ipoteca VALUES (
    'RO54BTRLRONCRT0511223101',
    1,
    2400.68,
    2700.87,
    'persoana fizica',
    'ipoteca prin deces',
    20.97,
    1
);

INSERT INTO ipoteca VALUES (
    'RO22INGB0000999909243742',
    1,
    3900.23,
    4500.76,
    'persoana fizica',
    'ipoteca prin taxa legala',
    2.687,
    2
);

INSERT INTO ipoteca VALUES (
    'RO98RNCB0053157166180001',
    1,
    5600.43,
    6400.12,
    'persoana fizica',
    'ipoteca prin deces',
    2.687,
    3
);

INSERT INTO ipoteca VALUES (
    'RO98RNCB0053157166180004',
    1,
    7869.32,
    8900.23,
    'persoana fizica',
    'ipoteca prin taxa legala',
    2.687,
    4
);

INSERT INTO ipoteca VALUES (
    'RO27INGB0000999908449416',
    2,
    9023.32,
    9600.23,
    'persoana fizica',
    'ipoteca prin taxa legala',
    2.687,
    5
);

INSERT INTO ipoteca VALUES (
    'RO12BTRLUSDCRT0249735201',
    3,
    12653.32,
    14023.23,
    'persoana fizica',
    'ipoteca prin deces',
    2.687,
    6
);

INSERT INTO ipoteca VALUES (
    'RO98RNCB0059808166180004',
    4,
    6400.32,
    7532.23,
    'persoana fizica',
    'ipoteca prin deces',
    2.687,
    7
);

--functie suma creditelor pe fiecare filiala si pt o anumita filiala

CREATE OR REPLACE FUNCTION get_suma_credite (
    codf NUMBER
) RETURN FLOAT IS
    v_suma_c   FLOAT(20);
    k          NUMBER;
    i          NUMBER;
BEGIN
    SELECT
        COUNT(cod_filiala)
    INTO k
    FROM
        filiala;

    SELECT
        nvl(SUM(suma_de_restituit), 0)
    INTO v_suma_c
    FROM
        ipoteca
    WHERE
        cod_filiala = codf;

    dbms_output.put_line('Ati selectat filiala '
                         || codf
                         || ' .Suma creditelor pentru filiala cu numarul '
                         || codf
                         || ' este '
                         || v_suma_c);

    dbms_output.put_line('Suma creditelor pentru fiecare filiala: ');
    FOR i IN 1..k LOOP
        SELECT
            nvl(SUM(suma_de_restituit), 0)
        INTO v_suma_c
        FROM
            ipoteca
        WHERE
            cod_filiala = i;

        dbms_output.put_line('suma creditelor pentru filiala '
                             || i
                             || ' este '
                             || v_suma_c);
    END LOOP;

    RETURN v_suma_c;
END;
/

DECLARE
    a NUMBER;
BEGIN
    a := get_suma_credite(&x);
END;
/

--procedura pentru afisarea dobanzilor pentru fiecare client

CREATE OR REPLACE PROCEDURE get_lista_dob IS

    CURSOR dobc IS
    SELECT
        client.nr_client,
        rata_dobanzii
    FROM
        ipoteca
        FULL OUTER JOIN client ON ipoteca.nr_client = client.nr_client
    ORDER BY
        client.nr_client;

BEGIN
    dbms_output.put_line('Nr. client'
                         || chr(9)
                         || 'Rata dobanzii');
    FOR rec IN dobc LOOP dbms_output.put_line(rec.nr_client
                                              || chr(9)
                                              || chr(9)
                                              || chr(9)
                                              || nvl(rec.rata_dobanzii, 0));
    END LOOP;

EXCEPTION
    WHEN OTHERS THEN
        dbms_output.put_line(sqlerrm);
END;
/

EXEC get_lista_dob;