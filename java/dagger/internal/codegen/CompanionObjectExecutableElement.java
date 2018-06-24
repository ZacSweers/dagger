package dagger.internal.codegen;

import com.google.common.collect.ImmutableSet;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ElementVisitor;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.Name;
import javax.lang.model.element.TypeParameterElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.TypeMirror;

/**
 * An {@link ExecutableElement} that delegates to a real one but reflects that it is an enclosed
 * element of a Kotlin companion object, and thus should be considered part of the enclosing
 * TypeElement with {@link #companionObjectName} accessing notation. This also reports itself as
 * having a {@link Modifier#STATIC} modifier.
 */
final class CompanionObjectExecutableElement implements ExecutableElement {

  private final ExecutableElement delegate;
  final String companionObjectName;

  CompanionObjectExecutableElement(ExecutableElement delegate, String companionObjectName) {
    this.delegate = delegate;
    this.companionObjectName = companionObjectName;
  }

  @Override public List<? extends TypeParameterElement> getTypeParameters() {
    return delegate.getTypeParameters();
  }

  @Override public TypeMirror getReturnType() {
    return delegate.getReturnType();
  }

  @Override public List<? extends VariableElement> getParameters() {
    return delegate.getParameters();
  }

  @Override public TypeMirror getReceiverType() {
    return delegate.getReceiverType();
  }

  @Override public boolean isVarArgs() {
    return delegate.isVarArgs();
  }

  @Override public boolean isDefault() {
    return delegate.isDefault();
  }

  @Override public List<? extends TypeMirror> getThrownTypes() {
    return delegate.getThrownTypes();
  }

  @Override public AnnotationValue getDefaultValue() {
    return delegate.getDefaultValue();
  }

  @Override public TypeMirror asType() {
    return delegate.asType();
  }

  @Override public ElementKind getKind() {
    return delegate.getKind();
  }

  @Override public Set<Modifier> getModifiers() {
    return ImmutableSet.<Modifier>builder()
        .addAll(delegate.getModifiers())
        .add(Modifier.STATIC)
        .build();
  }

  @Override public Name getSimpleName() {
    return delegate.getSimpleName();
  }

  @Override public Element getEnclosingElement() {
    return delegate.getEnclosingElement();
  }

  @Override public List<? extends Element> getEnclosedElements() {
    return delegate.getEnclosedElements();
  }

  @Override public List<? extends AnnotationMirror> getAnnotationMirrors() {
    return delegate.getAnnotationMirrors();
  }

  @Override public <A extends Annotation> A getAnnotation(Class<A> annotationType) {
    return delegate.getAnnotation(annotationType);
  }

  @Override public <A extends Annotation> A[] getAnnotationsByType(Class<A> annotationType) {
    return delegate.getAnnotationsByType(annotationType);
  }

  @Override public <R, P> R accept(ElementVisitor<R, P> v, P p) {
    return delegate.accept(v, p);
  }
}
