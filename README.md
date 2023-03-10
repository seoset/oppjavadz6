Паттерны проектирования
1.	Поведенческий паттерн проектирования. «Наблюдатель» – паттерн проектирования, который описывает отношение «один ко многим», то есть если простыми словами, при изменении одного объекта изменяются все другие, которые зависят от него.
Рассмотрим на примере: мы проектируем приложение с графическим интерфейсом. По нажатию на кнопку нам надо изменять цвет окна. Как сказать окну о том, что кнопка нажата и пора менять цвет? Постоянно проверять состояние? Для этого и служит паттерн «Наблюдатель», мы подписываемся на получение изменений другого объекта. Ага, кнопку нажали, давайте оповестим об этом всех слушателей!
2.	Порождающий паттерн программирования. «Одиночка» - паттерн проектирования, который ограничивает создания объектов данного класса одним экземпляром.
Рассмотрим на примере: допустим мы создаем игру и у нас только один главный персонаж. Поэтому мы воспользуемся «Одиночкой», ограничив создания экземпляров класса главного персонажа и получив точку доступа к единственному экземпляру. 
3.	Структурный паттерн программирования. «Фасад» упрощает использовать подсистемы и выносит высокоуровневый набор операций в отдельный класс.
Рассмотрим на примере: когда мы заводим машину, мы просто проворачиваем ключ в замке зажигания. Мы не задумываемся о том, что происходит под капотом, какая электроника начинает работать и прочее. Тем самым можно сказать, что ключ – это фасад, простой интерфейс для сложной системы.

