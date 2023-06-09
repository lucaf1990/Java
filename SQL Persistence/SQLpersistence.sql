PGDMP                         {           Javapersitence_1    15.2    15.2 "    ;           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            <           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            =           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            >           1262    16459    Javapersitence_1    DATABASE     �   CREATE DATABASE "Javapersitence_1" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = icu LOCALE = 'en_US.UTF-8' ICU_LOCALE = 'en-US';
 "   DROP DATABASE "Javapersitence_1";
                postgres    false            �            1259    16519    clients    TABLE     �   CREATE TABLE public.clients (
    numerocliente integer NOT NULL,
    nome character varying NOT NULL,
    cognome character varying NOT NULL,
    datadinascita date NOT NULL,
    regioneresidenza character varying NOT NULL
);
    DROP TABLE public.clients;
       public         heap    postgres    false            �            1259    16518    clients_numerocliente_seq    SEQUENCE     �   CREATE SEQUENCE public.clients_numerocliente_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 0   DROP SEQUENCE public.clients_numerocliente_seq;
       public          postgres    false    215            ?           0    0    clients_numerocliente_seq    SEQUENCE OWNED BY     W   ALTER SEQUENCE public.clients_numerocliente_seq OWNED BY public.clients.numerocliente;
          public          postgres    false    214            �            1259    16528 	   fornitori    TABLE     �   CREATE TABLE public.fornitori (
    numerofornitore integer NOT NULL,
    denominazione character varying NOT NULL,
    regioneresidenza character varying NOT NULL
);
    DROP TABLE public.fornitori;
       public         heap    postgres    false            �            1259    16527    fornitori_numerofornitore_seq    SEQUENCE     �   CREATE SEQUENCE public.fornitori_numerofornitore_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 4   DROP SEQUENCE public.fornitori_numerofornitore_seq;
       public          postgres    false    217            @           0    0    fornitori_numerofornitore_seq    SEQUENCE OWNED BY     _   ALTER SEQUENCE public.fornitori_numerofornitore_seq OWNED BY public.fornitori.numerofornitore;
          public          postgres    false    216            �            1259    16567    invoices    TABLE       CREATE TABLE public.invoices (
    numerofattura integer NOT NULL,
    tipologia character varying NOT NULL,
    importo numeric NOT NULL,
    iva bigint DEFAULT 20 NOT NULL,
    idcliente bigint NOT NULL,
    datafattura date NOT NULL,
    numerofornitore bigint NOT NULL
);
    DROP TABLE public.invoices;
       public         heap    postgres    false            �            1259    16566    invoices_numerofattura_seq    SEQUENCE     �   CREATE SEQUENCE public.invoices_numerofattura_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 1   DROP SEQUENCE public.invoices_numerofattura_seq;
       public          postgres    false    219            A           0    0    invoices_numerofattura_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public.invoices_numerofattura_seq OWNED BY public.invoices.numerofattura;
          public          postgres    false    218            �            1259    16587    products    TABLE     �   CREATE TABLE public.products (
    idprodotto integer NOT NULL,
    descrizione character varying NOT NULL,
    inproduzione boolean NOT NULL,
    incommercio boolean NOT NULL,
    dataattivazione date,
    datadisattivazione date
);
    DROP TABLE public.products;
       public         heap    postgres    false            �            1259    16586    products_idprodotto_seq    SEQUENCE     �   CREATE SEQUENCE public.products_idprodotto_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 .   DROP SEQUENCE public.products_idprodotto_seq;
       public          postgres    false    221            B           0    0    products_idprodotto_seq    SEQUENCE OWNED BY     S   ALTER SEQUENCE public.products_idprodotto_seq OWNED BY public.products.idprodotto;
          public          postgres    false    220            �           2604    16522    clients numerocliente    DEFAULT     ~   ALTER TABLE ONLY public.clients ALTER COLUMN numerocliente SET DEFAULT nextval('public.clients_numerocliente_seq'::regclass);
 D   ALTER TABLE public.clients ALTER COLUMN numerocliente DROP DEFAULT;
       public          postgres    false    215    214    215            �           2604    16531    fornitori numerofornitore    DEFAULT     �   ALTER TABLE ONLY public.fornitori ALTER COLUMN numerofornitore SET DEFAULT nextval('public.fornitori_numerofornitore_seq'::regclass);
 H   ALTER TABLE public.fornitori ALTER COLUMN numerofornitore DROP DEFAULT;
       public          postgres    false    216    217    217            �           2604    16570    invoices numerofattura    DEFAULT     �   ALTER TABLE ONLY public.invoices ALTER COLUMN numerofattura SET DEFAULT nextval('public.invoices_numerofattura_seq'::regclass);
 E   ALTER TABLE public.invoices ALTER COLUMN numerofattura DROP DEFAULT;
       public          postgres    false    218    219    219            �           2604    16590    products idprodotto    DEFAULT     z   ALTER TABLE ONLY public.products ALTER COLUMN idprodotto SET DEFAULT nextval('public.products_idprodotto_seq'::regclass);
 B   ALTER TABLE public.products ALTER COLUMN idprodotto DROP DEFAULT;
       public          postgres    false    220    221    221            2          0    16519    clients 
   TABLE DATA           `   COPY public.clients (numerocliente, nome, cognome, datadinascita, regioneresidenza) FROM stdin;
    public          postgres    false    215   V(       4          0    16528 	   fornitori 
   TABLE DATA           U   COPY public.fornitori (numerofornitore, denominazione, regioneresidenza) FROM stdin;
    public          postgres    false    217   )       6          0    16567    invoices 
   TABLE DATA           s   COPY public.invoices (numerofattura, tipologia, importo, iva, idcliente, datafattura, numerofornitore) FROM stdin;
    public          postgres    false    219   �)       8          0    16587    products 
   TABLE DATA           {   COPY public.products (idprodotto, descrizione, inproduzione, incommercio, dataattivazione, datadisattivazione) FROM stdin;
    public          postgres    false    221   C*       C           0    0    clients_numerocliente_seq    SEQUENCE SET     H   SELECT pg_catalog.setval('public.clients_numerocliente_seq', 24, true);
          public          postgres    false    214            D           0    0    fornitori_numerofornitore_seq    SEQUENCE SET     L   SELECT pg_catalog.setval('public.fornitori_numerofornitore_seq', 20, true);
          public          postgres    false    216            E           0    0    invoices_numerofattura_seq    SEQUENCE SET     I   SELECT pg_catalog.setval('public.invoices_numerofattura_seq', 29, true);
          public          postgres    false    218            F           0    0    products_idprodotto_seq    SEQUENCE SET     F   SELECT pg_catalog.setval('public.products_idprodotto_seq', 16, true);
          public          postgres    false    220            �           2606    16526    clients clients_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY public.clients
    ADD CONSTRAINT clients_pkey PRIMARY KEY (numerocliente);
 >   ALTER TABLE ONLY public.clients DROP CONSTRAINT clients_pkey;
       public            postgres    false    215            �           2606    16535    fornitori fornitori_pkey 
   CONSTRAINT     c   ALTER TABLE ONLY public.fornitori
    ADD CONSTRAINT fornitori_pkey PRIMARY KEY (numerofornitore);
 B   ALTER TABLE ONLY public.fornitori DROP CONSTRAINT fornitori_pkey;
       public            postgres    false    217            �           2606    16575    invoices invoices_pkey 
   CONSTRAINT     _   ALTER TABLE ONLY public.invoices
    ADD CONSTRAINT invoices_pkey PRIMARY KEY (numerofattura);
 @   ALTER TABLE ONLY public.invoices DROP CONSTRAINT invoices_pkey;
       public            postgres    false    219            �           2606    16594    products products_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.products
    ADD CONSTRAINT products_pkey PRIMARY KEY (idprodotto);
 @   ALTER TABLE ONLY public.products DROP CONSTRAINT products_pkey;
       public            postgres    false    221            �           2606    16581    invoices invoice_fornitori_fk    FK CONSTRAINT     �   ALTER TABLE ONLY public.invoices
    ADD CONSTRAINT invoice_fornitori_fk FOREIGN KEY (numerofornitore) REFERENCES public.fornitori(numerofornitore) ON UPDATE CASCADE ON DELETE CASCADE;
 G   ALTER TABLE ONLY public.invoices DROP CONSTRAINT invoice_fornitori_fk;
       public          postgres    false    217    219    3484            �           2606    16576    invoices invoices_client_fk    FK CONSTRAINT     �   ALTER TABLE ONLY public.invoices
    ADD CONSTRAINT invoices_client_fk FOREIGN KEY (idcliente) REFERENCES public.clients(numerocliente) ON UPDATE CASCADE ON DELETE CASCADE;
 E   ALTER TABLE ONLY public.invoices DROP CONSTRAINT invoices_client_fk;
       public          postgres    false    215    3482    219            2   �   x���K�0еs�Tv��&��*!�J��9v��g��!�w�0�52Pߣ�������(l��|`y���9��uk�l* ��|�˱�XA.��Z����,0��K��<Ր��\��R	���@���VW<uEw��5�CUQ��9�{��]9�����a��ťtS      4   h   x�m�K� E�q�cC�UI
����:�q���!�mr"�kg���S�$zm�n��.qps�3��]��p�c8��2d~�r��R
i���\j�Bz*D|W�4�      6   �   x���;� �ٜ" ��5�T��)�[��:�#Rh$&�c�Lט�c�����'!xx�a}G���cs�5q�Ҝ�fı�Q~G��@���9iu;�m�.V�bd�]o�u۵��P�h��-�1�U4}]3�ЌE�V�p}M'���P�������Op��3O��z:c��؄+      8   �   x���A
� ��x
/`�1�M.�d#�C���&�� A7��}H��odr��BLG#�B�a|	S�aˍ��z�>)�a��2xR��~P�(4iJk���V����-��j����`��zB_&�t�����
jj�/��:�mt��%3�U�@raw|!v��     