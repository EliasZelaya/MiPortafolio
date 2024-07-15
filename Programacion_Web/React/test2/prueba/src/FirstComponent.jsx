const string = 'Texto'
const number = 123
const array = ['texto 1', 'texto 2', 123]
const boolean = true
const funcion = () => 1 + 1
const objeto = { nombre: 'name', duracion: 14 }
const fecha = new Date()

export const FirstComponent = () => {
  return (
    <>
      <h1>Variables en JSX</h1>
      <h4>Variable de tipo String</h4>
      <p>{string}</p>
      <h4>Variable de tipo Number</h4>
      <p>{number}</p>
      <h4>Variable de tipo Array</h4>
      <p>{array}</p>
      <h4>Variable de tipo Boolean</h4>
      <p>{boolean}</p>
      <h4>Variable de tipo Functcion</h4>
      <p>{funcion()}</p>
      <h4>Variable de tipo objeto</h4>
      <p>{JSON.stringify(fecha)}</p>
    </>
  )
}
