# UNI Store

**Tienda virtual universitaria** — curso Programación Orientada a Objetos (POO), 2022

> 🧪 **Maqueta académica (2022).** Proyecto del curso *POO*, conservado como repo de muestra de mi evolución. El código se mantiene tal como se escribió en el curso; solo se agregaron los arreglos mínimos para poder desplegarlo como demo estática de solo visualización.

E-commerce académico para una tienda universitaria: catálogo de productos con ofertas, detalle de producto, registro/login de clientes y perfil. Desarrollado en capas como exigía el curso: frontend SPA, API REST en Java y base de datos relacional.

## Stack (2022)

| Capa | Tecnología |
|---|---|
| Frontend | Angular 14 + Tailwind CSS 3 |
| Backend | Java 11 + Spring Boot 2.7 (JDBC) |
| Base de datos | MariaDB/MySQL |

## Estructura

```
frontend/   SPA Angular. Tiene modo demo con datos mock — desplegable en Vercel
backend/    API Spring Boot original (2022): requiere MariaDB local
database/   Script SQL del esquema (unistore.sql)
```

## Demo (solo visualización)

Con `demo: true` (valor por defecto en `frontend/src/environments/`) la aplicación no necesita backend: un `HttpInterceptor` ([frontend/src/app/demo/](frontend/src/app/demo/)) responde los endpoints del API 2022 con datos ficticios. Se muestra un banner de maqueta y los cambios no se guardan.

```bash
cd frontend
pnpm install
pnpm start
```

### Desplegar en Vercel

1. Importar el repositorio en Vercel.
2. **Root Directory: `frontend`** (preset Angular; `frontend/vercel.json` ya define output y rewrites de SPA).
3. Deploy. El modo demo ya viene activo.

## Stack completo 2022 (opcional)

Solo si se quiere correr la aplicación contra el backend real:

1. MariaDB/MySQL local: ejecutar `database/unistore.sql` (crea la base `unistore`).
2. Backend: `cd backend && ./mvnw spring-boot:run` (puerto 8080; credenciales vía `DB_URL`, `DB_USERNAME`, `DB_PASSWORD`, con defaults de la época).
3. Frontend: poner `demo: false` en `frontend/src/environments/environment.ts` y `pnpm start`.

## Nota histórica

El carrito de compras es un agregado posterior para la demo (servicio client-side con `localStorage`): en el código 2022 solo existían botones decorativos, sin lógica en el frontend ni endpoints en el backend.

El código 2022 se conserva a propósito (plantillas con clases utilitarias repetidas, vistas a medio cablear, sin guards de auth). Los únicos cambios posteriores son: el modo demo con banner, la ruta raíz que redirige a la tienda, el binding de datos en el perfil, configuración por variables de entorno en el backend, la reorganización de carpetas (las iteraciones intermedias —BackEnd-v2/v2.1/v3, FrontEnd-v2, PRUEBA LOGIN— viven en el historial de git) y la actualización de dependencias dentro de los mismos majors con migración a pnpm.
