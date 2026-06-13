# Sistema de diseño — UNI Store

> **Norte:** *comercio editorial cálido*. UNI Store es una tienda virtual universitaria:
> catálogo, ofertas, detalle de producto, carrito. El objetivo 2026 no es "más botones",
> es que **el producto se vea apetecible y la marca se sienta premium** — el rango de
> Vercel Commerce, Aesop, los temas Shopify *Dawn*-grade y la calidez de Glossier.
>
> **Codename:** *Brasa* (por la guinda, ascua universitaria). **Audiencia:** estudiantes comprando.
> **Plataforma:** mobile-first, responsive. **Stack real:** Angular 14 + Tailwind CSS 3 →
> todo lo de aquí se realiza extendiendo `tailwind.config.js`, `styles.scss` y unas pocas plantillas,
> **no** reescribiendo la app.

---

## 1. Principios

1. **El producto manda.** Imagen grande, fondo que respira, cromo mínimo. La foto vende; la UI no compite.
2. **Calidez, no frialdad.** Lienzo crema y neutros *greige* (no gris azulado). Una tienda se siente acogedora, no corporativa.
3. **La guinda es acento, no inundación.** El color de marca vive en header, CTAs y badges — bloques intencionales, no fondos enormes.
4. **Editorial sobre utilitario.** Titulares con serif expresiva; el todo-mayúsculas se jubila. La tipografía da el "caro".
5. **Tacto y respuesta.** Hover que levanta, imagen que hace zoom suave, "agregar al carrito" que se siente. Micro-interacciones con propósito.
6. **Confianza visible.** Precio claro, oferta honesta (precio tachado + ahorro), stock, envío/devolución. La estética sostiene la conversión.

---

## 2. Tendencias 2026 que adoptamos (y por qué encajan aquí)

| Tendencia | Cómo la usamos en UNI Store |
|---|---|
| **Fondos cálidos (cream/greige)** | Lienzo `#faf7f3` en vez de `gray-50` frío. Premium inmediato. |
| **Pairing serif editorial + grotesca limpia** | Fraunces (titulares) + Inter (cuerpo/UI). El sello de marca 2026. |
| **Imágenes grandes y ratio retrato** | Cards 4:5, hover-zoom, segunda imagen en hover. |
| **Shared-element / View Transitions** | La foto del card "vuela" al detalle. Efecto wow, costo bajo. |
| **Cart drawer (off-canvas)** | Carrito como panel deslizante con spring, no página aparte. |
| **Micro-interacciones de carrito** | Badge que rebota, botón que pasa a ✓. |
| **Trust micro-copy + ratings** | Estrellas, stock, envío — confianza sin saturar. |

---

## 3. Tokens de color

Fuente de verdad en HEX (directo a Tailwind). La guinda se mantiene como ancla de marca, pero **enriquecida en rampa** y acompañada de un sistema *greige* cálido.

### 3.1 Neutros cálidos (greige) — el lienzo

| Token | HEX | Uso |
|---|---|---|
| `cream` | `#faf7f3` | Fondo de la app (reemplaza `bg-gray-50`) |
| `surface` | `#ffffff` | Cards, paneles, drawer |
| `sand` | `#f4efe9` | Secciones alternas, hover de fondo |
| `border` | `#e8e0d6` | Bordes hairline cálidos |
| `ink` | `#211c1a` | Texto principal (casi negro cálido) |
| `ink-2` | `#6b615b` | Texto secundario |
| `ink-muted` | `#9a8f87` | Metadatos, placeholder, tachado |

### 3.2 Marca — guinda (universitaria)

| Paso | HEX | | Paso | HEX |
|---|---|---|---|---|
| `guinda/50` | `#fbf1f1` | | `guinda/500` | `#a83a3f` |
| `guinda/100` | `#f6dedf` | | `guinda/600` | `#7a1f23` ← **DEFAULT** |
| `guinda/200` | `#ecbcbe` | | `guinda/700` | `#651a1d` (`dark`) |
| `guinda/300` | `#dd9094` | | `guinda/800` | `#511619` |
| `guinda/400` | `#c75f64` | | `guinda/900` | `#421316` |

### 3.3 Accent — teal fresco

Contrapunto frío a la guinda (links, foco, detalles). El `#3babba` actual es lindo pero **flojo para texto**; usar el oscuro para tipografía.

| Token | HEX | Uso |
|---|---|---|
| `accent/400` | `#2bb8c9` | Detalles, hover decorativo |
| `accent/500` | `#1399a9` | **Texto/links accesibles** (contraste OK) |
| `accent/600` | `#0f7d8a` | Texto sobre cream |

### 3.4 Funcionales

| Rol | HEX | Uso |
|---|---|---|
| `sale` | `#7a1f23` (guinda) | Badge OFERTA (cohesión de marca) |
| `success` | `#138a5e` | "Agregado", en stock |
| `star` | `#e8a13a` | Rating |
| `danger` | `#cf3b3f` | Errores, quitar del carrito |

> El precio de oferta va en `guinda/600` **negrita**; el original en `ink-muted` **tachado**. El ahorro ("−30 %") como chip `success` tenue.

---

## 4. Tipografía

**Cambio estrella:** pairing editorial.

- **Display / titulares → Fraunces** (variable, con carácter; *opsz* alto en hero). Da el aire "premium de catálogo".
- **Cuerpo / UI → Inter** (limpia, neutra, legible en precios y formularios).
- Precios con **numerales tabulares**.

```scss
// styles.scss
:root {
  --font-display: "Fraunces", Georgia, serif;
  --font-sans: "Inter", system-ui, sans-serif;
}
body { font-family: var(--font-sans); }
.font-display { font-family: var(--font-display); }
```

### Escala

| Rol | Tamaño | Fuente / Peso | Uso |
|---|---|---|---|
| `hero` | clamp(2.5rem, 6vw, 4rem) | Fraunces 500 | Banner de la tienda |
| `h1` | 2rem | Fraunces 600 | Título de página |
| `h2` | 1.5rem | Fraunces 600 | Encabezado de sección |
| `product-title` | 1rem | Inter 600 | Nombre en card/detalle |
| `body` | 0.95–1rem | Inter 400 | Descripciones |
| `price` | 1.125rem | Inter 700 · tnum | Precio |
| `badge` | 0.69rem | Inter 700 · 0.08em · UPPER | OFERTA, etiquetas |

> Regla anti-2022: el `uppercase tracking-wide` solo sobrevive en `badge`/overlines. Títulos en serif, *Title case*, sin estirar. Adiós al "TIENDA" en mayúsculas estiradas.

---

## 5. Espaciado, radio, sombra, motion

### Espaciado
Rejilla de 8. El comercio respira: secciones con `py-12/16`, gap de grilla `gap-6/8`, padding de card `p-4/5`. `max-w-7xl` se mantiene.

### Radio

| Token | px | Uso |
|---|---|---|
| `md` | 12 | Inputs, botones secundarios |
| `lg` | 16 | Cards de producto, imágenes (sube desde `rounded-xl`) |
| `xl` | 20 | Paneles, drawer, hero |
| `full` | 999 | CTAs pill, badges, chips de filtro |

> CTAs principales en **pill** (`rounded-full`) — on-brand y vigente. Botón sustancial, no fino.

### Sombra — suave, tintada en cálido

```
card        0 1px 2px rgba(33,28,26,.05)
card-hover  0 12px 28px -8px rgba(33,28,26,.18)   /* + -translate-y-0.5 + img scale 1.04 */
drawer      0 24px 60px -12px rgba(33,28,26,.30)
focus       0 0 0 3px rgba(122,31,35,.30)          /* anillo guinda accesible */
```

### Motion

| Token | Valor |
|---|---|
| `dur/tap` | 120 ms |
| `dur/hover` | 220 ms |
| `dur/zoom` | 320 ms (image scale) |
| `dur/drawer` | 280 ms |
| `ease/standard` | `cubic-bezier(.2,.8,.2,1)` |
| `ease/emphasized` | `cubic-bezier(.16,1,.3,1)` |

Card: hover → `translateY(-2px)` + sombra `card-hover` + imagen `scale(1.04)`. Carrito: badge con resorte al sumar; botón "Agregar" → ✓ + color `success` 1 s. **Todo** bajo `prefers-reduced-motion: reduce` cae a solo-opacidad.

---

## 6. Componentes clave

- **Card de producto.** `surface`, radio `lg`, sombra `card`→`card-hover`. Imagen ratio **4:5** `object-cover` con `overflow-hidden` (para el zoom). Badge OFERTA pill arriba-izq. Título Inter 600, descripción `line-clamp-2 ink-2`. Bloque de precio (oferta guinda bold + original tachado + chip ahorro). CTA "Agregar" pill guinda + "Detalle" fantasma con borde. Quick-add al hover en desktop.
- **Botones.** Primary = guinda sólido pill, hover `guinda/700`. Secondary = borde `guinda` fantasma, hover relleno. Ghost = solo texto `accent/600`. Estados disabled con `ink-muted`.
- **Badge / chip.** Pill, `badge` type. OFERTA guinda; ahorro `success` tenue; filtros como chips conmutables `border`/activo guinda.
- **Header.** Sticky, condensa al hacer scroll (alto y sombra). Logo + nav + **search** + carrito con contador (badge spring). En mobile, nav en drawer. Mantener guinda de fondo pero más fino y con blur al condensar.
- **Cart drawer.** Off-canvas derecha, radio `xl` izq, sombra `drawer`. Líneas con thumbnail, stepper de cantidad, subtotal sticky abajo + CTA checkout. Empty-state con icono + "Ir a la tienda".
- **Inputs (login/register/perfil).** Radio `md`, borde `border`, foco anillo guinda. Labels claras, validación inline en `danger`. Tarjetas de formulario centradas, `surface`, sombra `card`.
- **Footer.** Editorial, multi-columna, marca universitaria, fondo `ink` o `guinda/900`.

---

## 7. Pantallas — aplicación concreta

| Pantalla actual | Movida 2026 |
|---|---|
| `tienda` (grilla) | **Hero editorial** (titular Fraunces + imagen cálida + rail de ofertas) sobre la grilla. Cards retrato con hover-zoom y quick-add. Barra de filtros en chips pill. |
| `detalle` / `detalle-detalle` | Galería + **buy box sticky** (precio, ahorro, stepper, CTA pill). Fila de confianza (envío/devolución/stock). Rail "También te puede gustar". Transición shared-element desde el card. |
| `carrito` | Pasar a **drawer** deslizante; la página completa solo como fallback. Subtotal sticky, recomendados. |
| `login` / `register` / `perfil` | Tarjeta centrada en `cream`, serif en el título, social buttons (Google/Facebook ya hay SVG) con borde neutro, foco guinda. |
| Header global (repetido en cada vista) | Extraer a un componente de layout único; sticky + condensación; carrito con badge animado. |

### Momentos "presumibles" (orden de impacto)
1. **Hero editorial + grilla de cards retrato con hover-zoom.**
2. **Cart drawer con micro-interacción de "agregar".**
3. **Detalle con buy box sticky + transición shared-element de la imagen.**
4. **Lienzo crema + serif Fraunces** (cambio de "sensación" instantáneo).

---

## 8. Accesibilidad (WCAG 2.2 AA)

- Contraste ≥ 4.5:1 texto. `guinda/600` sobre blanco ≈ 8:1 ✓; el teal `#3babba` **no** sirve para texto → usar `accent/500–600`.
- `:focus-visible` con anillo guinda en todo control. Nav y drawer **operables por teclado** (trap de foco + `Esc` cierra).
- OFERTA y stock con **texto**, no solo color. Precio tachado además con `<del>` semántico.
- `alt` real en cada imagen de producto. Touch targets ≥ 44 px. `prefers-reduced-motion` respetado.

---

## 9. Anti-patrones a eliminar (deudas 2022)

- ❌ `uppercase tracking-wide` en todo → solo en badges/overlines.
- ❌ `bg-gray-50` frío y grises azulados → greige cálido (`cream`/`sand`).
- ❌ Header duplicado y clases utilitarias repetidas en cada plantilla → componente de layout + clases `@layer components` (`.card`, `.btn-primary`, `.badge`).
- ❌ Imágenes `h-44` fijas y ratios inconsistentes → ratio retrato uniforme `aspect-[4/5]`.
- ❌ Carrito como página plana → drawer.

---

## 10. Realización en Tailwind + Angular (centralizada)

Todo vive en `tailwind.config.js` + `styles.scss` + un componente de layout. Orden de adopción:

- **P0 — Tokens.** Extender `theme` con la rampa guinda, greige, teal, `fontFamily` (Fraunces+Inter), `borderRadius`, `boxShadow`, `keyframes` (zoom, bounce). Cargar fuentes (`@fontsource` o Google Fonts). Cambiar `body` a `cream`.
- **P1 — Card + header + botones.** Clases en `@layer components`; ratio 4:5; hover-zoom; pill CTAs; header sticky único.
- **P2 — Cart drawer + buy box sticky.** Angular Animations para el drawer; stepper de cantidad; micro-interacción de "agregar".
- **P3 — Hero editorial + View Transitions + grano sutil.** Transición de imagen card→detalle; textura de grano ligera en `cream`.

```js
// tailwind.config.js (extracto del objetivo)
theme: {
  extend: {
    colors: {
      cream: "#faf7f3", sand: "#f4efe9",
      ink: { DEFAULT: "#211c1a", 2: "#6b615b", muted: "#9a8f87" },
      guinda: { DEFAULT: "#7a1f23", dark: "#651a1d", light: "#a83a3f",
                50:"#fbf1f1",100:"#f6dedf",200:"#ecbcbe",300:"#dd9094",
                400:"#c75f64",500:"#a83a3f",600:"#7a1f23",700:"#651a1d",
                800:"#511619",900:"#421316" },
      accent: { DEFAULT:"#1399a9", 400:"#2bb8c9", 500:"#1399a9", 600:"#0f7d8a" },
    },
    fontFamily: {
      display: ['"Fraunces"', "Georgia", "serif"],
      sans: ['"Inter"', "system-ui", "sans-serif"],
    },
    borderRadius: { lg: "16px", xl: "20px" },
    boxShadow: {
      card: "0 1px 2px rgba(33,28,26,.05)",
      "card-hover": "0 12px 28px -8px rgba(33,28,26,.18)",
      drawer: "0 24px 60px -12px rgba(33,28,26,.30)",
    },
  },
},
```

> **Filosofía de cambio:** repo-maqueta preservado. La dirección se logra con
> **config + clases utilitarias + un layout compartido**, no reescribiendo plantillas
> una por una. Si un cambio se repite en cada vista, conviértelo en una clase de `@layer components`.

---

### Referencias 2026
Vercel Commerce (estructura) · Aesop (calidez editorial) · Shopify *Dawn* (cards/grid) · Glossier (tono cálido) · Linear (foco/teclado) para el drawer.
