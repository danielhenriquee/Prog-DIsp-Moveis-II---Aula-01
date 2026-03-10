/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 */
import React, { useState } from 'react';
import { Text, TextInput, Button } from 'react-native';
import { NewAppScreen } from '@react-native/new-app-screen';
import { StatusBar, StyleSheet, useColorScheme, View } from 'react-native';
import {
  SafeAreaProvider,
  useSafeAreaInsets,
} from 'react-native-safe-area-context';

function App() {
  const isDarkMode = useColorScheme() === 'dark';

  return (
    <SafeAreaProvider>
      <StatusBar barStyle={isDarkMode ? 'light-content' : 'dark-content'} />
      <AppContent />
    </SafeAreaProvider>
  );
}

function AppContent() {
  const safeAreaInsets = useSafeAreaInsets();

  const [text, setText] = useState('');
  const [show, setShow] = useState(false);

  return (
    <View style={styles.container}>
      <TextInput
        placeholder="Digite algo"
        value={text}
        onChangeText={setText}
        style={{ borderWidth: 1, margin: 10, padding: 8 }}
      />

      <Button
        title="Mostrar / Ocultar"
        onPress={() => setShow(!show)}
      />

      {show && (
        <Text style={{ margin: 10 }}>
          {text}
        </Text>
      )}
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    marginTop: 30
  },
});

export default App;
