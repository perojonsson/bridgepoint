/**
 * generated by Xtext 2.9.2
 */
package org.xtuml.bp.xtext.masl.masl.types;

import org.xtuml.bp.xtext.masl.masl.behavior.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constrained Array Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.types.ConstrainedArrayTypeReference#getUnconstrained <em>Unconstrained</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.types.ConstrainedArrayTypeReference#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @see org.xtuml.bp.xtext.masl.masl.types.TypesPackage#getConstrainedArrayTypeReference()
 * @model
 * @generated
 */
public interface ConstrainedArrayTypeReference extends AbstractTypeReference {
	/**
	 * Returns the value of the '<em><b>Unconstrained</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unconstrained</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unconstrained</em>' reference.
	 * @see #setUnconstrained(TypeDeclaration)
	 * @see org.xtuml.bp.xtext.masl.masl.types.TypesPackage#getConstrainedArrayTypeReference_Unconstrained()
	 * @model
	 * @generated
	 */
	TypeDeclaration getUnconstrained();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.types.ConstrainedArrayTypeReference#getUnconstrained <em>Unconstrained</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unconstrained</em>' reference.
	 * @see #getUnconstrained()
	 * @generated
	 */
	void setUnconstrained(TypeDeclaration value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference.
	 * @see #setConstraint(Expression)
	 * @see org.xtuml.bp.xtext.masl.masl.types.TypesPackage#getConstrainedArrayTypeReference_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	Expression getConstraint();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.types.ConstrainedArrayTypeReference#getConstraint <em>Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' containment reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(Expression value);

} // ConstrainedArrayTypeReference